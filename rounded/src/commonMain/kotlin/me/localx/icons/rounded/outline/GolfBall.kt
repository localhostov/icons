package me.localx.icons.rounded.outline

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

public val Icons.Outline.GolfBall: ImageVector
    get() {
        if (_golfBall != null) {
            return _golfBall!!
        }
        _golfBall = Builder(name = "GolfBall", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 12.0f)
                close()
                moveTo(10.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 11.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(14.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 7.0f)
                close()
                moveTo(16.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 8.0f)
                close()
                moveTo(15.945f, 17.086f)
                arcToRelative(4.959f, 4.959f, 0.0f, false, true, -1.41f, 2.792f)
                lineTo(13.0f, 21.414f)
                lineTo(13.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 21.414f)
                lineTo(9.464f, 19.878f)
                arcToRelative(4.962f, 4.962f, 0.0f, false, true, -1.41f, -2.792f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 7.891f, 0.0f)
                close()
                moveTo(13.121f, 18.464f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, false, 0.8f, -1.464f)
                horizontalLineToRelative(-3.85f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, false, 0.8f, 1.464f)
                lineTo(12.0f, 19.586f)
                close()
                moveTo(19.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 8.406f, 15.005f)
                curveTo(8.437f, 15.0f, 8.468f, 15.0f, 8.5f, 15.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.032f, 0.0f, 0.063f, 0.0f, 0.094f, 0.005f)
                arcTo(6.966f, 6.966f, 0.0f, false, false, 19.0f, 9.0f)
                close()
            }
        }
        .build()
        return _golfBall!!
    }

private var _golfBall: ImageVector? = null
