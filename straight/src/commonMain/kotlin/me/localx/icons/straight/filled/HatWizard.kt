package me.localx.icons.straight.filled

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

public val Icons.Filled.HatWizard: ImageVector
    get() {
        if (_hatWizard != null) {
            return _hatWizard!!
        }
        _hatWizard = Builder(name = "HatWizard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.848f, 22.0f)
                lineToRelative(-6.077f, -14.339f)
                lineTo(20.6f, 0.003f)
                lineToRelative(-8.684f, 1.532f)
                curveToRelative(-1.712f, 0.302f, -3.122f, 1.446f, -3.771f, 3.059f)
                lineTo(1.15f, 22.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.152f)
                close()
                moveTo(10.5f, 14.0f)
                lineToRelative(-0.833f, -1.667f)
                lineToRelative(-1.667f, -0.833f)
                lineToRelative(1.667f, -0.833f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(0.833f, 1.667f)
                lineToRelative(1.667f, 0.833f)
                lineToRelative(-1.667f, 0.833f)
                lineToRelative(-0.833f, 1.667f)
                close()
                moveTo(15.5f, 18.5f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(-2.0f, 1.0f)
                close()
            }
        }
        .build()
        return _hatWizard!!
    }

private var _hatWizard: ImageVector? = null
