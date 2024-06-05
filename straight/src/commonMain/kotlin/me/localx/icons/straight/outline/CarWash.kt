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

public val Icons.Outline.CarWash: ImageVector
    get() {
        if (_carWash != null) {
            return _carWash!!
        }
        _carWash = Builder(name = "CarWash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 18.6f)
                arcToRelative(12.059f, 12.059f, 0.0f, false, false, -1.267f, -5.367f)
                lineTo(19.447f, 8.658f)
                arcTo(2.985f, 2.985f, 0.0f, false, false, 16.764f, 7.0f)
                lineTo(7.236f, 7.0f)
                arcTo(2.985f, 2.985f, 0.0f, false, false, 4.553f, 8.658f)
                lineTo(2.267f, 13.23f)
                arcTo(12.059f, 12.059f, 0.0f, false, false, 1.0f, 18.6f)
                lineTo(1.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 22.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.342f, 9.553f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 7.236f, 9.0f)
                horizontalLineToRelative(9.528f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, 0.894f, 0.553f)
                lineTo(19.882f, 14.0f)
                lineTo(4.118f, 14.0f)
                close()
                moveTo(21.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                lineTo(3.0f, 18.6f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 3.345f, 16.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(7.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(19.0f, 16.0f)
                horizontalLineToRelative(1.655f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 21.0f, 18.6f)
                close()
                moveTo(10.586f, 4.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineTo(12.0f, 0.0f)
                lineToRelative(1.414f, 1.586f)
                arcTo(2.013f, 2.013f, 0.0f, false, true, 12.0f, 5.0f)
                arcTo(1.99f, 1.99f, 0.0f, false, true, 10.586f, 4.414f)
                close()
                moveTo(16.571f, 4.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineTo(17.985f, 0.0f)
                lineTo(19.4f, 1.586f)
                arcTo(2.013f, 2.013f, 0.0f, false, true, 17.985f, 5.0f)
                arcTo(1.992f, 1.992f, 0.0f, false, true, 16.571f, 4.414f)
                close()
                moveTo(4.571f, 4.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineTo(5.985f, 0.0f)
                lineTo(7.4f, 1.586f)
                arcTo(2.013f, 2.013f, 0.0f, false, true, 5.985f, 5.0f)
                arcTo(1.992f, 1.992f, 0.0f, false, true, 4.571f, 4.414f)
                close()
            }
        }
        .build()
        return _carWash!!
    }

private var _carWash: ImageVector? = null
