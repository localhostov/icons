package me.localx.icons.rounded.filled

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

public val Icons.Filled.SkiingNordic: ImageVector
    get() {
        if (_skiingNordic != null) {
            return _skiingNordic!!
        }
        _skiingNordic = Builder(name = "SkiingNordic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 12.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 5.0f)
                close()
                moveTo(23.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.739f, 1.982f)
                lineTo(22.975f, 9.225f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.95f, -0.45f)
                lineTo(20.512f, 11.0f)
                lineTo(19.13f, 11.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, -0.856f, -0.484f)
                lineToRelative(-1.261f, -2.1f)
                arcTo(5.026f, 5.026f, 0.0f, false, false, 12.729f, 6.0f)
                lineTo(6.5f, 6.0f)
                arcTo(3.011f, 3.011f, 0.0f, false, false, 4.083f, 7.22f)
                lineTo(3.208f, 8.407f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.61f, 1.186f)
                lineToRelative(0.874f, -1.187f)
                arcTo(1.006f, 1.006f, 0.0f, false, true, 6.5f, 8.0f)
                lineTo(9.461f, 8.0f)
                lineTo(7.7f, 12.273f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.175f, 3.676f)
                lineToRelative(3.658f, 2.308f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 19.1f)
                lineTo(13.0f, 22.0f)
                lineTo(7.238f, 22.0f)
                lineToRelative(1.2f, -3.48f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.85f, -0.758f)
                lineTo(5.076f, 22.0f)
                lineTo(2.255f, 22.0f)
                lineToRelative(1.786f, -8.776f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.95f, -0.448f)
                lineToRelative(-2.066f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 19.0f)
                close()
                moveTo(13.6f, 16.566f)
                lineTo(12.425f, 15.824f)
                lineTo(15.144f, 9.224f)
                curveToRelative(0.055f, 0.074f, 1.415f, 2.325f, 1.415f, 2.325f)
                arcTo(3.016f, 3.016f, 0.0f, false, false, 19.13f, 13.0f)
                horizontalLineToRelative(0.92f)
                lineTo(18.2f, 22.0f)
                lineTo(15.0f, 22.0f)
                lineTo(15.0f, 19.1f)
                arcTo(2.984f, 2.984f, 0.0f, false, false, 13.6f, 16.566f)
                close()
            }
        }
        .build()
        return _skiingNordic!!
    }

private var _skiingNordic: ImageVector? = null
