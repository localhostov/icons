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

public val Icons.Bold.Tents: ImageVector
    get() {
        if (_tents != null) {
            return _tents!!
        }
        _tents = Builder(name = "Tents", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 5.945f)
                lineTo(0.415f, 19.7f)
                curveToRelative(-0.538f, 0.883f, -0.557f, 1.947f, -0.052f, 2.847f)
                curveToRelative(0.509f, 0.907f, 1.479f, 1.471f, 2.53f, 1.471f)
                horizontalLineToRelative(13.213f)
                curveToRelative(1.051f, 0.0f, 2.021f, -0.563f, 2.53f, -1.471f)
                curveToRelative(0.505f, -0.899f, 0.486f, -1.964f, -0.081f, -2.893f)
                lineTo(9.5f, 5.945f)
                close()
                moveTo(12.616f, 21.018f)
                lineToRelative(-3.116f, -4.817f)
                lineToRelative(-3.116f, 4.817f)
                horizontalLineToRelative(-3.245f)
                lineToRelative(6.361f, -9.63f)
                lineToRelative(6.362f, 9.63f)
                horizontalLineToRelative(-3.246f)
                close()
                moveTo(23.637f, 16.547f)
                curveToRelative(-0.509f, 0.907f, -1.479f, 1.471f, -2.53f, 1.471f)
                horizontalLineToRelative(-1.235f)
                lineToRelative(-1.982f, -3.0f)
                horizontalLineToRelative(2.972f)
                lineToRelative(-6.362f, -9.63f)
                lineToRelative(-1.485f, 2.249f)
                lineToRelative(-1.798f, -2.721f)
                lineTo(14.5f, -0.055f)
                lineToRelative(9.056f, 13.709f)
                curveToRelative(0.567f, 0.929f, 0.586f, 1.993f, 0.081f, 2.893f)
                close()
            }
        }
        .build()
        return _tents!!
    }

private var _tents: ImageVector? = null
