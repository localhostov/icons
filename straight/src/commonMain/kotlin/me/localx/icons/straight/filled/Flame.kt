package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.477f, 18.61f)
                curveToRelative(0.0f, -1.283f, -0.808f, -2.029f, -2.357f, -3.344f)
                curveToRelative(-0.35f, -0.3f, -0.728f, -0.618f, -1.118f, -0.972f)
                curveToRelative(-0.445f, 0.409f, -0.868f, 0.769f, -1.256f, 1.1f)
                curveTo(9.2f, 16.7f, 8.523f, 17.339f, 8.523f, 18.61f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, false, 6.954f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.408f, 4.035f)
                curveToRelative(-1.2f, -1.019f, -2.44f, -2.072f, -3.694f, -3.325f)
                lineTo(12.0f, 0.0f)
                lineTo(11.3f, 0.711f)
                curveToRelative(-2.254f, 2.262f, -3.32f, 5.736f, -3.782f, 7.82f)
                arcToRelative(6.04f, 6.04f, 0.0f, false, true, -0.779f, -1.785f)
                lineTo(6.312f, 5.109f)
                lineTo(5.079f, 6.266f)
                curveToRelative(-2.159f, 2.028f, -3.6f, 4.039f, -3.6f, 7.259f)
                arcToRelative(10.422f, 10.422f, 0.0f, false, false, 7.8f, 10.18f)
                arcTo(11.153f, 11.153f, 0.0f, false, false, 11.0f, 24.0f)
                arcToRelative(5.491f, 5.491f, 0.0f, false, true, -4.485f, -5.39f)
                curveToRelative(0.0f, -2.25f, 1.357f, -3.4f, 2.928f, -4.742f)
                curveToRelative(0.561f, -0.477f, 1.2f, -1.018f, 1.845f, -1.667f)
                lineTo(12.0f, 11.493f)
                lineToRelative(0.708f, 0.708f)
                curveToRelative(0.576f, 0.576f, 1.152f, 1.064f, 1.709f, 1.538f)
                curveToRelative(1.576f, 1.337f, 3.064f, 2.6f, 3.064f, 4.871f)
                arcToRelative(5.489f, 5.489f, 0.0f, false, true, -4.456f, 5.384f)
                arcTo(10.51f, 10.51f, 0.0f, false, false, 22.52f, 13.527f)
                curveTo(22.52f, 9.225f, 19.687f, 6.82f, 16.408f, 4.035f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
