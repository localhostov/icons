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

public val Icons.Outline.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4f, 5.051f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.559f, 3.0f)
                lineTo(16.72f, 3.0f)
                lineTo(16.4f, 2.051f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.559f, 0.0f)
                lineTo(10.441f, 0.0f)
                arcTo(2.994f, 2.994f, 0.0f, false, false, 7.6f, 2.052f)
                lineTo(7.28f, 3.0f)
                lineTo(6.441f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.6f, 5.051f)
                lineTo(2.28f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.613f, 11.0f)
                lineToRelative(-0.561f, 1.684f)
                lineTo(1.1f, 12.7f)
                arcTo(2.982f, 2.982f, 0.0f, false, false, 0.0f, 15.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                lineTo(22.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 15.0f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, -1.1f, -2.3f)
                lineToRelative(0.046f, -0.015f)
                lineTo(22.387f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 9.0f)
                lineTo(21.72f, 9.0f)
                close()
                moveTo(9.492f, 2.684f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.441f, 2.0f)
                horizontalLineToRelative(3.118f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.949f, 0.684f)
                lineTo(14.613f, 3.0f)
                lineTo(9.387f, 3.0f)
                close()
                moveTo(5.492f, 5.684f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.441f, 5.0f)
                lineTo(17.559f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.949f, 0.684f)
                lineTo(20.613f, 12.0f)
                lineTo(3.387f, 12.0f)
                close()
                moveTo(6.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(18.0f, 22.0f)
                lineTo(18.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(5.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(6.0f, 14.0f)
                lineTo(18.0f, 14.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(20.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
