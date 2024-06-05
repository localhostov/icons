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

public val Icons.Outline.Heat: ImageVector
    get() {
        if (_heat != null) {
            return _heat!!
        }
        _heat = Builder(name = "Heat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.016f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.964f, -1.269f)
                curveToRelative(0.116f, -0.419f, 0.247f, -0.808f, 0.377f, -1.191f)
                curveToRelative(1.285f, -2.684f, 0.18f, -6.683f, -1.256f, -8.554f)
                arcTo(12.313f, 12.313f, 0.0f, false, true, 17.359f, 0.576f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.811f, 0.848f)
                arcToRelative(10.307f, 10.307f, 0.0f, false, false, 0.686f, 10.483f)
                curveToRelative(1.675f, 2.137f, 2.986f, 7.113f, 1.467f, 10.271f)
                curveToRelative(-0.118f, 0.351f, -0.238f, 0.708f, -0.345f, 1.091f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.016f, 24.0f)
                close()
                moveTo(13.016f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.964f, -1.269f)
                curveToRelative(0.116f, -0.419f, 0.247f, -0.808f, 0.377f, -1.191f)
                curveToRelative(1.285f, -2.684f, 0.18f, -6.683f, -1.256f, -8.554f)
                arcTo(12.313f, 12.313f, 0.0f, false, true, 10.359f, 0.576f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.811f, 0.848f)
                arcToRelative(10.307f, 10.307f, 0.0f, false, false, 0.686f, 10.483f)
                curveToRelative(1.675f, 2.137f, 2.986f, 7.113f, 1.467f, 10.271f)
                curveToRelative(-0.118f, 0.351f, -0.238f, 0.708f, -0.345f, 1.091f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.016f, 24.0f)
                close()
                moveTo(6.016f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.964f, -1.269f)
                curveToRelative(0.116f, -0.419f, 0.247f, -0.808f, 0.377f, -1.191f)
                curveToRelative(1.285f, -2.684f, 0.18f, -6.683f, -1.256f, -8.554f)
                arcTo(12.313f, 12.313f, 0.0f, false, true, 3.359f, 0.576f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.811f, 0.848f)
                arcToRelative(10.307f, 10.307f, 0.0f, false, false, 0.686f, 10.483f)
                curveToRelative(1.675f, 2.137f, 2.986f, 7.113f, 1.467f, 10.271f)
                curveToRelative(-0.118f, 0.351f, -0.238f, 0.708f, -0.345f, 1.091f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.016f, 24.0f)
                close()
            }
        }
        .build()
        return _heat!!
    }

private var _heat: ImageVector? = null
