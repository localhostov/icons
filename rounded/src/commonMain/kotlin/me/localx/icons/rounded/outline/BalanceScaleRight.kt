package me.localx.icons.rounded.outline

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

public val Icons.Outline.BalanceScaleRight: ImageVector
    get() {
        if (_balanceScaleRight != null) {
            return _balanceScaleRight!!
        }
        _balanceScaleRight = Builder(name = "BalanceScaleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.94f, 14.658f)
                lineToRelative(-3.005f, -8.265f)
                curveToRelative(-0.461f, -1.267f, -1.519f, -2.21f, -2.829f, -2.523f)
                lineToRelative(-5.105f, -1.221f)
                lineTo(13.001f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.17f)
                lineTo(6.531f, 1.102f)
                curveToRelative(-1.514f, -0.404f, -3.061f, 0.404f, -3.59f, 1.869f)
                lineTo(0.063f, 10.649f)
                curveToRelative(-0.042f, 0.112f, -0.063f, 0.653f, -0.063f, 0.653f)
                curveToRelative(0.0f, 2.506f, 1.871f, 4.567f, 4.26f, 4.692f)
                curveToRelative(1.251f, 0.063f, 2.434f, -0.372f, 3.338f, -1.229f)
                curveToRelative(0.891f, -0.846f, 1.402f, -2.036f, 1.402f, -3.264f)
                curveToRelative(0.0f, 0.0f, -0.022f, -0.745f, -0.067f, -0.859f)
                lineTo(6.006f, 3.032f)
                curveToRelative(0.012f, 0.002f, 4.994f, 1.194f, 4.994f, 1.194f)
                lineTo(11.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(13.0f, 4.705f)
                lineToRelative(4.641f, 1.11f)
                curveToRelative(0.198f, 0.047f, 0.384f, 0.124f, 0.554f, 0.224f)
                lineToRelative(-3.135f, 8.619f)
                curveToRelative(-0.04f, 0.109f, -0.06f, 0.644f, -0.06f, 0.644f)
                curveToRelative(0.0f, 2.506f, 2.0f, 4.698f, 4.503f, 4.698f)
                curveToRelative(1.158f, 0.0f, 2.249f, -0.434f, 3.094f, -1.236f)
                curveToRelative(0.892f, -0.846f, 1.403f, -2.036f, 1.403f, -3.264f)
                curveToRelative(0.0f, 0.0f, 0.0f, -0.538f, -0.06f, -0.842f)
                close()
                moveTo(4.364f, 13.996f)
                curveToRelative(-1.081f, -0.057f, -1.986f, -0.902f, -2.266f, -1.997f)
                lineTo(6.95f, 11.999f)
                curveToRelative(-0.1f, 0.499f, -0.35f, 0.954f, -0.729f, 1.313f)
                curveToRelative(-0.502f, 0.478f, -1.165f, 0.719f, -1.856f, 0.683f)
                close()
                moveTo(6.544f, 9.999f)
                lineTo(2.443f, 9.999f)
                lineToRelative(2.024f, -5.401f)
                lineToRelative(2.078f, 5.401f)
                close()
                moveTo(19.5f, 8.3f)
                lineToRelative(2.072f, 5.699f)
                horizontalLineToRelative(-4.145f)
                lineToRelative(2.072f, -5.699f)
                close()
                moveTo(19.364f, 17.995f)
                curveToRelative(-1.081f, -0.057f, -1.986f, -0.902f, -2.266f, -1.997f)
                horizontalLineToRelative(4.851f)
                curveToRelative(-0.1f, 0.499f, -0.35f, 0.954f, -0.729f, 1.313f)
                curveToRelative(-0.503f, 0.478f, -1.168f, 0.717f, -1.856f, 0.683f)
                close()
            }
        }
        .build()
        return _balanceScaleRight!!
    }

private var _balanceScaleRight: ImageVector? = null
