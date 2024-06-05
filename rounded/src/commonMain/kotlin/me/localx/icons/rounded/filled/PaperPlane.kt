package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.308f, viewportHeight = 512.308f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(505.878f, 36.682f)
                lineTo(110.763f, 431.69f)
                curveToRelative(8.542f, 4.163f, 17.911f, 6.351f, 27.413f, 6.4f)
                horizontalLineToRelative(67.669f)
                curveToRelative(5.661f, -0.015f, 11.092f, 2.236f, 15.083f, 6.251f)
                lineToRelative(36.672f, 36.651f)
                curveToRelative(19.887f, 20.024f, 46.936f, 31.295f, 75.157f, 31.317f)
                curveToRelative(11.652f, -0.011f, 23.224f, -1.921f, 34.261f, -5.653f)
                curveToRelative(38.05f, -12.475f, 65.726f, -45.46f, 71.403f, -85.099f)
                lineToRelative(72.085f, -342.4f)
                curveTo(513.948f, 64.89f, 512.311f, 49.871f, 505.878f, 36.682f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(433.771f, 1.652f)
                lineTo(92.203f, 73.61f)
                curveTo(33.841f, 81.628f, -6.971f, 135.44f, 1.047f, 193.802f)
                curveToRelative(3.167f, 23.048f, 13.782f, 44.43f, 30.228f, 60.885f)
                lineToRelative(36.651f, 36.651f)
                curveToRelative(4.006f, 4.005f, 6.255f, 9.439f, 6.251f, 15.104f)
                verticalLineToRelative(67.669f)
                curveToRelative(0.049f, 9.502f, 2.237f, 18.872f, 6.4f, 27.413f)
                lineTo(475.627f, 6.41f)
                curveTo(462.645f, 0.03f, 447.853f, -1.651f, 433.771f, 1.652f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
