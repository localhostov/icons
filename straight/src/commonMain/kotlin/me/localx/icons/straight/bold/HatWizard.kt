package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.HatWizard: ImageVector
    get() {
        if (_hatWizard != null) {
            return _hatWizard!!
        }
        _hatWizard = Builder(name = "HatWizard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 17.5f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(2.0f, 1.0f)
                close()
                moveTo(11.5f, 14.0f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(1.667f, -0.833f)
                lineToRelative(-1.667f, -0.833f)
                lineToRelative(-0.833f, -1.667f)
                lineToRelative(-0.833f, 1.667f)
                lineToRelative(-1.667f, 0.833f)
                lineToRelative(1.667f, 0.833f)
                lineToRelative(0.833f, 1.667f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.287f)
                lineTo(7.778f, 4.988f)
                curveToRelative(0.716f, -1.767f, 2.264f, -3.019f, 4.141f, -3.35f)
                lineTo(21.175f, 0.005f)
                lineToRelative(-4.022f, 8.043f)
                lineToRelative(5.551f, 12.952f)
                horizontalLineToRelative(1.296f)
                close()
                moveTo(4.524f, 21.0f)
                horizontalLineToRelative(14.915f)
                lineToRelative(-5.592f, -13.048f)
                lineToRelative(1.978f, -3.957f)
                lineToRelative(-3.384f, 0.597f)
                curveToRelative(-0.853f, 0.15f, -1.557f, 0.72f, -1.882f, 1.523f)
                lineToRelative(-6.035f, 14.885f)
                close()
            }
        }
        .build()
        return _hatWizard!!
    }

private var _hatWizard: ImageVector? = null
