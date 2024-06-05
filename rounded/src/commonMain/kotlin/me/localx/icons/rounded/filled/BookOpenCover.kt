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

public val Icons.Filled.BookOpenCover: ImageVector
    get() {
        if (_bookOpenCover != null) {
            return _bookOpenCover!!
        }
        _bookOpenCover = Builder(name = "BookOpenCover", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-0.555f, 0.0f, -1.109f, -0.077f, -1.648f, -0.231f)
                lineToRelative(-6.726f, -1.921f)
                curveToRelative(-2.135f, -0.61f, -3.626f, -2.587f, -3.626f, -4.808f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(13.04f)
                curveToRelative(0.0f, 1.333f, 0.895f, 2.519f, 2.176f, 2.885f)
                lineToRelative(6.726f, 1.921f)
                curveToRelative(0.719f, 0.205f, 1.478f, 0.205f, 2.198f, 0.0f)
                lineToRelative(6.725f, -1.921f)
                curveToRelative(1.281f, -0.366f, 2.176f, -1.552f, 2.176f, -2.885f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(14.04f)
                curveToRelative(0.0f, 2.22f, -1.491f, 4.197f, -3.626f, 4.808f)
                lineToRelative(-6.726f, 1.921f)
                curveToRelative(-0.54f, 0.154f, -1.094f, 0.231f, -1.648f, 0.231f)
                close()
                moveTo(18.023f, 0.155f)
                curveToRelative(-0.728f, -0.269f, -1.539f, -0.202f, -2.26f, 0.086f)
                lineToRelative(-0.877f, 0.35f)
                curveToRelative(-1.139f, 0.455f, -1.887f, 1.559f, -1.887f, 2.786f)
                verticalLineToRelative(14.496f)
                curveToRelative(-0.328f, 0.084f, -0.663f, 0.127f, -1.0f, 0.127f)
                reflectiveCurveToRelative(-0.672f, -0.043f, -1.0f, -0.127f)
                verticalLineTo(3.377f)
                curveToRelative(0.0f, -1.227f, -0.747f, -2.331f, -1.887f, -2.786f)
                lineToRelative(-0.878f, -0.351f)
                curveToRelative(-0.721f, -0.288f, -1.532f, -0.355f, -2.26f, -0.085f)
                curveToRelative(-1.215f, 0.45f, -1.976f, 1.583f, -1.976f, 2.822f)
                verticalLineTo(15.691f)
                curveToRelative(0.0f, 1.339f, 0.888f, 2.516f, 2.175f, 2.884f)
                lineToRelative(4.176f, 1.194f)
                curveToRelative(0.538f, 0.153f, 1.093f, 0.23f, 1.648f, 0.23f)
                reflectiveCurveToRelative(1.11f, -0.077f, 1.648f, -0.23f)
                lineToRelative(4.176f, -1.194f)
                curveToRelative(1.288f, -0.368f, 2.175f, -1.545f, 2.175f, -2.884f)
                verticalLineTo(2.977f)
                curveToRelative(0.0f, -1.239f, -0.762f, -2.373f, -1.977f, -2.822f)
                close()
            }
        }
        .build()
        return _bookOpenCover!!
    }

private var _bookOpenCover: ImageVector? = null
