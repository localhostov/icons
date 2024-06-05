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

public val Icons.Outline.SunriseAlt: ImageVector
    get() {
        if (_sunriseAlt != null) {
            return _sunriseAlt!!
        }
        _sunriseAlt = Builder(name = "SunriseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.92f, 22.0f)
                arcToRelative(6.952f, 6.952f, 0.0f, false, false, -0.433f, -1.619f)
                lineToRelative(4.4f, -2.559f)
                lineToRelative(-1.006f, -1.728f)
                lineToRelative(-4.4f, 2.56f)
                arcToRelative(7.04f, 7.04f, 0.0f, false, false, -1.139f, -1.137f)
                lineToRelative(2.553f, -4.39f)
                lineToRelative(-1.729f, -1.006f)
                lineTo(14.61f, 16.51f)
                arcTo(6.95f, 6.95f, 0.0f, false, false, 13.0f, 16.08f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(5.08f)
                arcToRelative(6.914f, 6.914f, 0.0f, false, false, -1.6f, 0.425f)
                lineToRelative(-2.55f, -4.384f)
                lineTo(5.126f, 13.127f)
                lineToRelative(2.548f, 4.381f)
                arcToRelative(7.028f, 7.028f, 0.0f, false, false, -1.147f, 1.14f)
                lineTo(2.14f, 16.094f)
                lineTo(1.134f, 17.822f)
                lineToRelative(4.382f, 2.551f)
                arcTo(6.972f, 6.972f, 0.0f, false, false, 5.08f, 22.0f)
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
                moveTo(15.293f, 5.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 0.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.828f, 0.0f)
                lineTo(7.293f, 3.879f)
                lineTo(8.707f, 5.293f)
                lineTo(11.0f, 3.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _sunriseAlt!!
    }

private var _sunriseAlt: ImageVector? = null
