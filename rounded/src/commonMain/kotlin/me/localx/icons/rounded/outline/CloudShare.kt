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

public val Icons.Outline.CloudShare: ImageVector
    get() {
        if (_cloudShare != null) {
            return _cloudShare!!
        }
        _cloudShare = Builder(name = "CloudShare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.0f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, false, -2.077f, 0.844f)
                lineToRelative(-2.96f, -1.481f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.037f, -0.363f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -0.037f, -0.363f)
                lineToRelative(2.96f, -1.481f)
                arcToRelative(2.994f, 2.994f, 0.0f, true, false, -0.923f, -2.156f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.037f, 0.363f)
                lineToRelative(-2.96f, 1.481f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 4.312f)
                lineToRelative(2.96f, 1.481f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -0.037f, 0.363f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, -3.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(13.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(21.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-5.321f)
                arcToRelative(5.841f, 5.841f, 0.0f, false, true, -5.622f, -4.7f)
                arcToRelative(5.443f, 5.443f, 0.0f, false, true, 2.885f, -5.651f)
                arcToRelative(7.652f, 7.652f, 0.0f, false, true, -0.8f, -5.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.49f, -0.842f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, 0.722f, 0.735f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.588f, 1.911f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -2.044f, -2.053f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.06f, 4.513f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, true, -0.792f, 2.686f)
                arcToRelative(3.468f, 3.468f, 0.0f, false, false, -1.835f, 3.6f)
                arcToRelative(3.807f, 3.807f, 0.0f, false, false, 3.644f, 2.981f)
                horizontalLineToRelative(5.321f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _cloudShare!!
    }

private var _cloudShare: ImageVector? = null
