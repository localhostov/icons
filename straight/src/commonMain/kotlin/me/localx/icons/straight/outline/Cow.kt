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

public val Icons.Outline.Cow: ImageVector
    get() {
        if (_cow != null) {
            return _cow!!
        }
        _cow = Builder(name = "Cow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcToRelative(4.968f, 4.968f, 0.0f, false, false, 1.0f, -3.0f)
                lineTo(18.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(9.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                arcTo(4.968f, 4.968f, 0.0f, false, false, 5.0f, 3.0f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 4.0f)
                arcTo(6.589f, 6.589f, 0.0f, false, false, 3.267f, 9.272f)
                lineTo(6.0f, 21.129f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -2.871f)
                lineTo(20.733f, 9.272f)
                arcTo(6.589f, 6.589f, 0.0f, false, false, 24.0f, 4.0f)
                lineTo(24.0f, 3.0f)
                close()
                moveTo(15.688f, 5.0f)
                arcToRelative(9.875f, 9.875f, 0.0f, false, true, 2.706f, 2.978f)
                arcTo(5.08f, 5.08f, 0.0f, false, false, 13.0f, 13.0f)
                verticalLineToRelative(5.0f)
                lineTo(11.0f, 18.0f)
                lineTo(11.0f, 13.0f)
                arcTo(5.08f, 5.08f, 0.0f, false, false, 5.606f, 7.978f)
                arcTo(9.875f, 9.875f, 0.0f, false, true, 8.312f, 5.0f)
                close()
                moveTo(5.326f, 5.0f)
                arcTo(12.253f, 12.253f, 0.0f, false, false, 3.747f, 7.19f)
                arcTo(4.961f, 4.961f, 0.0f, false, true, 2.192f, 5.0f)
                close()
                moveTo(6.0f, 10.0f)
                arcToRelative(2.984f, 2.984f, 0.0f, false, true, 1.034f, 0.184f)
                arcToRelative(1.506f, 1.506f, 0.0f, false, false, 1.782f, 1.782f)
                arcTo(2.984f, 2.984f, 0.0f, false, true, 9.0f, 13.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, false, -1.564f, 0.441f)
                lineTo(5.483f, 9.976f)
                curveTo(5.652f, 9.992f, 5.824f, 10.0f, 6.0f, 10.0f)
                close()
                moveTo(15.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 22.0f)
                close()
                moveTo(16.564f, 18.441f)
                arcTo(2.978f, 2.978f, 0.0f, false, false, 15.0f, 18.0f)
                lineTo(15.0f, 13.0f)
                arcToRelative(2.984f, 2.984f, 0.0f, false, true, 0.184f, -1.034f)
                arcToRelative(1.506f, 1.506f, 0.0f, false, false, 1.782f, -1.782f)
                arcToRelative(4.906f, 4.906f, 0.0f, false, true, 1.551f, -0.208f)
                close()
                moveTo(20.253f, 7.19f)
                arcTo(12.253f, 12.253f, 0.0f, false, false, 18.674f, 5.0f)
                horizontalLineToRelative(3.134f)
                arcTo(4.961f, 4.961f, 0.0f, false, true, 20.253f, 7.19f)
                close()
            }
        }
        .build()
        return _cow!!
    }

private var _cow: ImageVector? = null
