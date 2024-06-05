package me.localx.icons.straight.outline

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

public val Icons.Outline.HatWizard: ImageVector
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
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.15f)
                lineTo(8.146f, 4.595f)
                curveToRelative(0.649f, -1.613f, 2.059f, -2.757f, 3.771f, -3.059f)
                lineTo(20.6f, 0.003f)
                lineToRelative(-3.829f, 7.657f)
                lineToRelative(6.077f, 14.339f)
                horizontalLineToRelative(1.152f)
                close()
                moveTo(3.305f, 22.0f)
                horizontalLineToRelative(17.37f)
                lineToRelative(-6.105f, -14.409f)
                lineToRelative(2.463f, -4.928f)
                lineToRelative(-4.77f, 0.842f)
                curveToRelative(-1.027f, 0.181f, -1.873f, 0.868f, -2.263f, 1.835f)
                lineTo(3.305f, 22.0f)
                close()
            }
        }
        .build()
        return _hatWizard!!
    }

private var _hatWizard: ImageVector? = null
