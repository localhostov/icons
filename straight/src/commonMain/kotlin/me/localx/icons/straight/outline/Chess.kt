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

public val Icons.Outline.Chess: ImageVector
    get() {
        if (_chess != null) {
            return _chess!!
        }
        _chess = Builder(name = "Chess", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.185f)
                lineTo(22.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                lineTo(23.0f, 7.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 9.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 9.0f)
                lineTo(15.0f, 9.0f)
                lineTo(15.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.026f)
                arcTo(4.988f, 4.988f, 0.0f, false, true, 15.9f, 20.0f)
                horizontalLineToRelative(5.08f)
                arcTo(0.96f, 0.96f, 0.0f, false, true, 22.0f, 21.0f)
                verticalLineToRelative(1.0f)
                lineTo(16.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 21.0f)
                arcTo(2.93f, 2.93f, 0.0f, false, false, 22.0f, 18.185f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                lineTo(16.0f, 18.0f)
                close()
                moveTo(11.771f, 18.113f)
                arcTo(42.377f, 42.377f, 0.0f, false, true, 10.028f, 9.0f)
                lineTo(11.0f, 9.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(-0.37f)
                lineToRelative(1.275f, -2.589f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.7f, -2.4f)
                lineTo(8.01f, 2.011f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.81f, 2.011f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.7f, 2.4f)
                lineTo(3.391f, 7.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 9.0f)
                horizontalLineToRelative(0.972f)
                arcTo(41.985f, 41.985f, 0.0f, false, true, 2.23f, 18.113f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(14.0f, 24.0f)
                lineTo(14.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.771f, 18.113f)
                close()
                moveTo(4.139f, 4.01f)
                horizontalLineToRelative(5.74f)
                lineTo(8.4f, 7.0f)
                lineTo(5.62f, 7.0f)
                close()
                moveTo(8.025f, 9.0f)
                arcToRelative(42.264f, 42.264f, 0.0f, false, false, 1.626f, 9.0f)
                lineTo(4.35f, 18.0f)
                arcTo(41.865f, 41.865f, 0.0f, false, false, 5.976f, 9.0f)
                close()
                moveTo(12.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _chess!!
    }

private var _chess: ImageVector? = null
