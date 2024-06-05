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

public val Icons.Filled.HeadSideThinking: ImageVector
    get() {
        if (_headSideThinking != null) {
            return _headSideThinking!!
        }
        _headSideThinking = Builder(name = "HeadSideThinking", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 11.0f)
                close()
                moveTo(24.0f, 12.788f)
                lineTo(24.0f, 15.0f)
                lineTo(21.67f, 15.0f)
                lineToRelative(-0.449f, 3.394f)
                arcTo(3.008f, 3.008f, 0.0f, false, true, 18.247f, 21.0f)
                lineTo(16.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 19.291f)
                arcToRelative(1.974f, 1.974f, 0.0f, false, false, -0.457f, -1.262f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 9.453f, 0.106f)
                arcTo(10.9f, 10.9f, 0.0f, false, true, 19.8f, 4.419f)
                arcToRelative(32.9f, 32.9f, 0.0f, false, true, 3.472f, 6.713f)
                curveTo(23.486f, 11.622f, 24.0f, 12.788f, 24.0f, 12.788f)
                close()
                moveTo(14.839f, 9.939f)
                lineTo(16.7f, 8.866f)
                lineToRelative(-1.0f, -1.732f)
                lineTo(13.85f, 8.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 7.142f)
                lineTo(12.0f, 5.0f)
                lineTo(10.0f, 5.0f)
                lineTo(10.0f, 7.142f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.15f, 8.2f)
                lineTo(6.3f, 7.134f)
                lineToRelative(-1.0f, 1.732f)
                lineTo(7.161f, 9.939f)
                arcTo(3.958f, 3.958f, 0.0f, false, false, 7.0f, 11.0f)
                arcToRelative(3.958f, 3.958f, 0.0f, false, false, 0.161f, 1.061f)
                lineTo(5.3f, 13.134f)
                lineToRelative(1.0f, 1.732f)
                lineTo(8.15f, 13.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 14.858f)
                lineTo(10.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 14.858f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 13.85f, 13.8f)
                lineTo(15.7f, 14.866f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(-1.857f, -1.073f)
                arcTo(3.958f, 3.958f, 0.0f, false, false, 15.0f, 11.0f)
                arcTo(3.958f, 3.958f, 0.0f, false, false, 14.839f, 9.939f)
                close()
            }
        }
        .build()
        return _headSideThinking!!
    }

private var _headSideThinking: ImageVector? = null
