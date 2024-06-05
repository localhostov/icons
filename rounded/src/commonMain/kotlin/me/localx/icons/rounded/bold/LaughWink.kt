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

public val Icons.Bold.LaughWink: ImageVector
    get() {
        if (_laughWink != null) {
            return _laughWink!!
        }
        _laughWink = Builder(name = "LaughWink", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 7.0f)
                arcTo(2.587f, 2.587f, 0.0f, false, true, 18.0f, 9.667f)
                curveTo(18.0f, 11.0f, 16.881f, 11.0f, 15.5f, 11.0f)
                reflectiveCurveTo(13.0f, 11.0f, 13.0f, 9.667f)
                arcTo(2.587f, 2.587f, 0.0f, false, true, 15.5f, 7.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(-3.9f, 0.6f, -3.893f, 23.4f, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, -9.0f, 9.0f)
                curveTo(0.076f, 20.548f, 0.081f, 3.451f, 12.0f, 3.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 21.0f, 12.0f)
                close()
                moveTo(11.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 8.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 9.5f)
                close()
                moveTo(15.463f, 14.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.469f, 1.469f, 0.0f, false, false, 7.2f, 16.2f)
                arcTo(5.865f, 5.865f, 0.0f, false, false, 11.964f, 19.0f)
                arcToRelative(5.863f, 5.863f, 0.0f, false, false, 4.767f, -2.8f)
                arcTo(1.468f, 1.468f, 0.0f, false, false, 15.463f, 14.0f)
                close()
            }
        }
        .build()
        return _laughWink!!
    }

private var _laughWink: ImageVector? = null
