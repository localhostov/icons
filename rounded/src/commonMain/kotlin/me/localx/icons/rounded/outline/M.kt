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

public val Icons.Outline.M: ImageVector
    get() {
        if (_m != null) {
            return _m!!
        }
        _m = Builder(name = "M", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 24.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineTo(3.486f)
                curveToRelative(0.0f, -0.861f, -0.587f, -1.306f, -1.137f, -1.436f)
                curveToRelative(-0.548f, -0.13f, -1.273f, 0.006f, -1.658f, 0.776f)
                lineToRelative(-6.311f, 12.621f)
                curveToRelative(-0.339f, 0.678f, -1.45f, 0.678f, -1.789f, 0.0f)
                lineTo(4.795f, 2.827f)
                curveToRelative(-0.385f, -0.771f, -1.109f, -0.906f, -1.659f, -0.776f)
                curveToRelative(-0.549f, 0.13f, -1.136f, 0.575f, -1.136f, 1.436f)
                verticalLineTo(23.0f)
                curveToRelative(-0.006f, 1.308f, -1.995f, 1.307f, -2.0f, 0.0f)
                verticalLineTo(3.486f)
                curveTo(0.0f, 1.841f, 1.076f, 0.482f, 2.677f, 0.104f)
                curveToRelative(1.601f, -0.379f, 3.171f, 0.357f, 3.907f, 1.828f)
                lineToRelative(5.416f, 10.832f)
                lineTo(17.416f, 1.932f)
                curveToRelative(0.735f, -1.472f, 2.307f, -2.209f, 3.907f, -1.828f)
                curveToRelative(1.601f, 0.378f, 2.677f, 1.737f, 2.677f, 3.382f)
                verticalLineTo(23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _m!!
    }

private var _m: ImageVector? = null
