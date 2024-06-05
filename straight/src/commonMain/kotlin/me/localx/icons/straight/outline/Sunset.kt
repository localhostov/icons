package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Sunset: ImageVector
    get() {
        if (_sunset != null) {
            return _sunset!!
        }
        _sunset = Builder(name = "Sunset", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.92f, 22.0f)
                arcToRelative(6.952f, 6.952f, 0.0f, false, false, -0.433f, -1.619f)
                lineToRelative(4.4f, -2.559f)
                lineToRelative(-1.006f, -1.728f)
                lineToRelative(-4.4f, 2.56f)
                arcToRelative(7.046f, 7.046f, 0.0f, false, false, -1.14f, -1.137f)
                lineToRelative(2.553f, -4.39f)
                lineToRelative(-1.729f, -1.005f)
                lineTo(14.61f, 16.51f)
                arcTo(6.95f, 6.95f, 0.0f, false, false, 13.0f, 16.08f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(5.08f)
                arcToRelative(6.914f, 6.914f, 0.0f, false, false, -1.6f, 0.425f)
                lineToRelative(-2.55f, -4.383f)
                lineTo(5.126f, 13.127f)
                lineToRelative(2.548f, 4.381f)
                arcToRelative(7.028f, 7.028f, 0.0f, false, false, -1.147f, 1.14f)
                lineTo(2.14f, 16.094f)
                lineTo(1.134f, 17.822f)
                lineToRelative(4.382f, 2.551f)
                arcTo(6.924f, 6.924f, 0.0f, false, false, 5.08f, 22.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(7.1f, 22.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 9.8f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.707f, 3.707f)
                lineTo(7.293f, 5.121f)
                lineToRelative(3.293f, 3.293f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.828f, 0.0f)
                lineToRelative(3.293f, -3.293f)
                lineTo(15.293f, 3.707f)
                lineTo(13.0f, 6.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _sunset!!
    }

private var _sunset: ImageVector? = null
