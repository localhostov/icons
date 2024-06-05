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

public val Icons.Filled.CarWash: ImageVector
    get() {
        if (_carWash != null) {
            return _carWash!!
        }
        _carWash = Builder(name = "CarWash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.063f, 14.0f)
                lineTo(1.937f, 14.0f)
                curveToRelative(0.107f, -0.258f, 0.2f, -0.52f, 0.33f, -0.77f)
                lineTo(4.553f, 8.658f)
                arcTo(2.985f, 2.985f, 0.0f, false, true, 7.236f, 7.0f)
                horizontalLineToRelative(9.528f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, true, 2.683f, 1.658f)
                lineToRelative(2.286f, 4.572f)
                curveTo(21.858f, 13.48f, 21.956f, 13.742f, 22.063f, 14.0f)
                close()
                moveTo(23.0f, 22.0f)
                lineTo(21.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 22.0f)
                lineTo(8.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 22.0f)
                lineTo(1.0f, 22.0f)
                lineTo(1.0f, 18.6f)
                arcTo(11.955f, 11.955f, 0.0f, false, true, 1.3f, 16.0f)
                horizontalLineToRelative(21.41f)
                arcToRelative(11.955f, 11.955f, 0.0f, false, true, 0.3f, 2.6f)
                close()
                moveTo(18.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 20.0f)
                close()
                moveTo(6.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 20.0f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, false, 1.414f, -3.414f)
                lineTo(12.0f, 0.0f)
                lineTo(10.586f, 1.586f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 5.0f)
                close()
                moveTo(17.985f, 5.0f)
                arcTo(2.013f, 2.013f, 0.0f, false, false, 19.4f, 1.586f)
                lineTo(17.985f, 0.0f)
                lineTo(16.571f, 1.586f)
                arcTo(2.013f, 2.013f, 0.0f, false, false, 17.985f, 5.0f)
                close()
                moveTo(5.985f, 5.0f)
                arcTo(2.013f, 2.013f, 0.0f, false, false, 7.4f, 1.586f)
                lineTo(5.985f, 0.0f)
                lineTo(4.571f, 1.586f)
                arcTo(2.013f, 2.013f, 0.0f, false, false, 5.985f, 5.0f)
                close()
            }
        }
        .build()
        return _carWash!!
    }

private var _carWash: ImageVector? = null
