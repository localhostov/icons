package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.MedicalStar: ImageVector
    get() {
        if (_medicalStar != null) {
            return _medicalStar!!
        }
        _medicalStar = Builder(name = "MedicalStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.192f, 18.267f)
                curveToRelative(-0.283f, 0.462f, -0.776f, 0.717f, -1.28f, 0.717f)
                curveToRelative(-0.268f, 0.0f, -0.538f, -0.071f, -0.782f, -0.221f)
                lineToRelative(-6.671f, -4.085f)
                verticalLineToRelative(7.822f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-7.823f)
                lineToRelative(-6.672f, 4.086f)
                curveToRelative(-0.244f, 0.149f, -0.515f, 0.221f, -0.782f, 0.221f)
                curveToRelative(-0.505f, 0.0f, -0.997f, -0.255f, -1.28f, -0.717f)
                curveToRelative(-0.433f, -0.706f, -0.211f, -1.63f, 0.496f, -2.062f)
                lineToRelative(6.865f, -4.204f)
                lineTo(2.221f, 7.796f)
                curveToRelative(-0.707f, -0.433f, -0.929f, -1.356f, -0.496f, -2.062f)
                curveToRelative(0.433f, -0.707f, 1.358f, -0.928f, 2.062f, -0.496f)
                lineToRelative(6.672f, 4.086f)
                verticalLineTo(1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(7.822f)
                lineToRelative(6.671f, -4.085f)
                curveToRelative(0.705f, -0.432f, 1.63f, -0.21f, 2.062f, 0.496f)
                reflectiveCurveToRelative(0.211f, 1.63f, -0.496f, 2.062f)
                lineToRelative(-6.865f, 4.204f)
                lineToRelative(6.865f, 4.204f)
                curveToRelative(0.707f, 0.433f, 0.929f, 1.356f, 0.496f, 2.062f)
                close()
            }
        }
        .build()
        return _medicalStar!!
    }

private var _medicalStar: ImageVector? = null
