package me.localx.icons.straight.bold

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

public val Icons.Bold.Swimmer: ImageVector
    get() {
        if (_swimmer != null) {
            return _swimmer!!
        }
        _swimmer = Builder(name = "Swimmer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 5.0f)
                close()
                moveTo(5.843f, 12.0f)
                lineToRelative(7.136f, -4.995f)
                lineToRelative(3.512f, 5.0f)
                horizontalLineToRelative(3.668f)
                reflectiveCurveTo(12.623f, 1.31f, 12.542f, 1.237f)
                arcTo(3.489f, 3.489f, 0.0f, false, false, 9.9f, 0.0f)
                lineTo(2.942f, 0.0f)
                lineTo(2.942f, 3.0f)
                lineTo(9.9f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.409f, 0.212f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.942f, 1.339f)
                lineTo(0.612f, 12.0f)
                close()
                moveTo(22.592f, 14.0f)
                lineTo(19.408f, 14.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(13.408f, 14.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(7.408f, 14.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(1.408f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(4.468f, 4.468f, 0.0f, false, false, 3.0f, -1.17f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcTo(4.468f, 4.468f, 0.0f, false, false, 24.0f, 18.0f)
                lineTo(24.0f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.592f, 14.0f)
                close()
                moveTo(22.592f, 20.0f)
                lineTo(19.408f, 20.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(13.408f, 20.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(7.408f, 20.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(1.408f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(4.468f, 4.468f, 0.0f, false, false, 3.0f, -1.17f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcTo(4.468f, 4.468f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(24.0f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.592f, 20.0f)
                close()
            }
        }
        .build()
        return _swimmer!!
    }

private var _swimmer: ImageVector? = null
