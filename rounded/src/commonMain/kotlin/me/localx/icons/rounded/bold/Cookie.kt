package me.localx.icons.rounded.bold

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

public val Icons.Bold.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.099f, 205.077f)
                moveToRelative(-42.667f, 0.0f)
                arcToRelative(42.667f, 42.667f, 0.0f, true, true, 85.334f, 0.0f)
                arcToRelative(42.667f, 42.667f, 0.0f, true, true, -85.334f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(426.667f, 43.136f)
                moveToRelative(-42.667f, 0.0f)
                arcToRelative(42.667f, 42.667f, 0.0f, true, true, 85.334f, 0.0f)
                arcToRelative(42.667f, 42.667f, 0.0f, true, true, -85.334f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 341.803f)
                moveToRelative(-42.667f, 0.0f)
                arcToRelative(42.667f, 42.667f, 0.0f, true, true, 85.334f, 0.0f)
                arcToRelative(42.667f, 42.667f, 0.0f, true, true, -85.334f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(510.763f, 231.531f)
                curveToRelative(-1.445f, -15.283f, -13.54f, -27.386f, -28.821f, -28.843f)
                curveToRelative(-91.428f, -8.852f, -163.779f, -81.221f, -172.608f, -172.651f)
                curveToRelative(-1.453f, -15.267f, -13.534f, -27.357f, -28.8f, -28.821f)
                curveTo(272.448f, 0.469f, 264.299f, 0.0f, 256.0f, 0.0f)
                curveTo(114.615f, 0.0f, 0.0f, 114.615f, 0.0f, 256.0f)
                reflectiveCurveToRelative(114.615f, 256.0f, 256.0f, 256.0f)
                reflectiveCurveToRelative(256.0f, -114.615f, 256.0f, -256.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(512.0f, 247.723f, 511.552f, 239.573f, 510.763f, 231.531f)
                close()
                moveTo(256.0f, 448.0f)
                curveToRelative(-106.039f, 1.708f, -193.385f, -82.868f, -195.093f, -188.907f)
                curveTo(59.198f, 153.055f, 143.775f, 65.708f, 249.813f, 64.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(20.878f, 99.535f, 98.65f, 177.298f, 198.187f, 198.165f)
                curveTo(444.572f, 365.745f, 359.636f, 447.953f, 256.0f, 448.0f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
