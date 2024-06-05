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
                moveTo(12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(14.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 7.0f)
                close()
                moveTo(10.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 11.0f)
                close()
                moveTo(16.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 8.0f)
                close()
                moveTo(21.0f, 9.0f)
                arcToRelative(8.941f, 8.941f, 0.0f, false, true, -5.0f, 8.031f)
                verticalLineToRelative(0.14f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, true, -0.878f, 2.121f)
                lineTo(13.0f, 21.414f)
                lineTo(13.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 21.414f)
                lineTo(8.879f, 19.293f)
                arcTo(2.982f, 2.982f, 0.0f, false, true, 8.0f, 17.171f)
                verticalLineToRelative(-0.14f)
                arcTo(8.988f, 8.988f, 0.0f, true, true, 21.0f, 9.0f)
                close()
                moveTo(14.0f, 17.0f)
                lineTo(10.0f, 17.0f)
                verticalLineToRelative(0.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, 0.708f)
                lineTo(12.0f, 19.586f)
                lineToRelative(1.707f, -1.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 17.171f)
                close()
                moveTo(19.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 8.4f, 15.0f)
                horizontalLineToRelative(7.2f)
                arcTo(6.963f, 6.963f, 0.0f, false, false, 19.0f, 9.0f)
                close()
            }
        }
        .build()
        return _golfBall!!
    }

private var _golfBall: ImageVector? = null
