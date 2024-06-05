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

public val Icons.Filled.Moped: ImageVector
    get() {
        if (_moped != null) {
            return _moped!!
        }
        _moped = Builder(name = "Moped", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 15.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 13.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.268f, 0.0f, -0.534f, 0.018f, -0.797f, 0.049f)
                lineToRelative(-1.676f, -4.312f)
                curveToRelative(0.289f, 0.163f, 0.618f, 0.263f, 0.974f, 0.263f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.893f, 0.0f, -1.64f, 0.589f, -1.897f, 1.397f)
                curveToRelative(-0.639f, -1.458f, -2.051f, -2.397f, -3.655f, -2.397f)
                horizontalLineToRelative(-0.448f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.448f)
                curveToRelative(0.817f, 0.0f, 1.566f, 0.513f, 1.864f, 1.275f)
                lineToRelative(2.447f, 6.292f)
                curveToRelative(-0.932f, 0.399f, -1.783f, 0.996f, -2.484f, 1.775f)
                lineToRelative(-1.64f, 1.947f)
                curveToRelative(-0.38f, 0.451f, -0.94f, 0.711f, -1.53f, 0.711f)
                horizontalLineToRelative(-0.229f)
                lineToRelative(-2.195f, -5.486f)
                curveToRelative(-0.607f, -1.519f, -2.078f, -2.514f, -3.714f, -2.514f)
                horizontalLineToRelative(-2.969f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.33f, 0.871f, 2.444f, 2.069f, 2.838f)
                curveToRelative(-0.041f, 0.217f, -0.069f, 0.437f, -0.069f, 0.662f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.169f, -0.016f, -0.335f, -0.04f, -0.5f)
                horizontalLineToRelative(3.148f)
                curveToRelative(1.179f, 0.0f, 2.297f, -0.52f, 3.056f, -1.422f)
                lineToRelative(1.619f, -1.923f)
                curveToRelative(0.947f, -1.052f, 2.302f, -1.655f, 3.717f, -1.655f)
                horizontalLineToRelative(2.5f)
                close()
            }
        }
        .build()
        return _moped!!
    }

private var _moped: ImageVector? = null
