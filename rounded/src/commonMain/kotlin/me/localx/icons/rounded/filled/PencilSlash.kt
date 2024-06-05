package me.localx.icons.rounded.filled

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

public val Icons.Filled.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) {
            return _pencilSlash!!
        }
        _pencilSlash = Builder(name = "PencilSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.725f, 7.985f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(3.507f, -3.507f)
                curveToRelative(1.024f, -1.024f, 2.685f, -1.024f, 3.71f, 0.0f)
                curveToRelative(1.024f, 1.024f, 1.024f, 2.685f, 0.0f, 3.71f)
                lineToRelative(-3.507f, 3.507f)
                close()
                moveTo(1.065f, 19.248f)
                curveToRelative(-0.677f, 0.737f, -1.065f, 1.694f, -1.065f, 2.699f)
                verticalLineToRelative(2.053f)
                horizontalLineToRelative(2.053f)
                curveToRelative(1.004f, 0.0f, 1.962f, -0.388f, 2.699f, -1.065f)
                lineToRelative(-3.686f, -3.686f)
                close()
                moveTo(2.467f, 17.822f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(5.547f, -5.547f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-5.547f, 5.547f)
                close()
                moveTo(14.561f, 13.147f)
                lineToRelative(3.749f, -3.749f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-3.749f, 3.749f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-9.145f, -9.145f)
                close()
            }
        }
        .build()
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null
