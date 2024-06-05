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

public val Icons.Bold.Chocolate: ImageVector
    get() {
        if (_chocolate != null) {
            return _chocolate!!
        }
        _chocolate = Builder(name = "Chocolate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.453f, 5.567f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(5.316f, 5.316f, 0.0f, false, false, -7.516f, 0.0f)
                lineToRelative(-9.371f, 9.37f)
                arcToRelative(5.322f, 5.322f, 0.0f, false, false, 0.0f, 7.516f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(5.312f, 5.312f, 0.0f, false, false, 7.517f, 0.0f)
                lineToRelative(9.369f, -9.369f)
                arcTo(5.322f, 5.322f, 0.0f, false, false, 22.453f, 5.567f)
                close()
                moveTo(14.7f, 3.011f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 1.637f, 0.677f)
                lineToRelative(0.9f, 0.9f)
                lineTo(14.22f, 7.6f)
                lineTo(11.684f, 5.063f)
                lineToRelative(1.375f, -1.375f)
                arcTo(2.3f, 2.3f, 0.0f, false, true, 14.7f, 3.011f)
                close()
                moveTo(14.192f, 17.111f)
                lineTo(11.57f, 14.491f)
                lineToRelative(2.65f, -2.65f)
                lineToRelative(2.617f, 2.617f)
                close()
                moveTo(9.449f, 12.37f)
                lineTo(6.913f, 9.833f)
                lineToRelative(2.65f, -2.649f)
                lineTo(12.1f, 9.72f)
                close()
                moveTo(3.688f, 13.058f)
                lineTo(4.788f, 11.958f)
                lineTo(7.325f, 14.495f)
                lineTo(4.585f, 17.235f)
                lineTo(3.685f, 16.335f)
                arcTo(2.319f, 2.319f, 0.0f, false, true, 3.688f, 13.058f)
                close()
                moveTo(7.688f, 20.332f)
                lineTo(6.708f, 19.352f)
                lineTo(9.448f, 16.612f)
                lineTo(12.064f, 19.229f)
                lineTo(10.964f, 20.329f)
                arcTo(2.369f, 2.369f, 0.0f, false, true, 7.689f, 20.332f)
                close()
                moveTo(20.331f, 10.963f)
                lineTo(18.957f, 12.337f)
                lineTo(16.341f, 9.72f)
                lineToRelative(3.011f, -3.012f)
                lineToRelative(0.98f, 0.98f)
                arcTo(2.32f, 2.32f, 0.0f, false, true, 20.332f, 10.963f)
                close()
            }
        }
        .build()
        return _chocolate!!
    }

private var _chocolate: ImageVector? = null
