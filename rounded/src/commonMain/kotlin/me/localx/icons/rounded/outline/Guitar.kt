package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

public val Icons.Outline.Guitar: ImageVector
    get() {
        if (_guitar != null) {
            return _guitar!!
        }
        _guitar = Builder(name = "Guitar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.707f, 16.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.482f, 0.518f)
                arcToRelative(1.767f, 1.767f, 0.0f, false, false, -2.5f, 0.0f)
                lineToRelative(-0.214f, 0.214f)
                arcToRelative(6.035f, 6.035f, 0.0f, false, false, -1.534f, 2.62f)
                lineTo(16.259f, 6.327f)
                arcToRelative(5.894f, 5.894f, 0.0f, false, false, -7.7f, 0.232f)
                arcToRelative(4.933f, 4.933f, 0.0f, false, false, -0.445f, 0.508f)
                arcToRelative(2.283f, 2.283f, 0.0f, false, true, -1.554f, 0.959f)
                arcToRelative(7.055f, 7.055f, 0.0f, false, false, -4.5f, 2.038f)
                curveToRelative(-2.956f, 2.957f, -2.7f, 8.025f, 0.575f, 11.3f)
                arcTo(8.8f, 8.8f, 0.0f, false, false, 8.814f, 24.0f)
                arcToRelative(7.164f, 7.164f, 0.0f, false, false, 5.122f, -2.059f)
                arcToRelative(7.055f, 7.055f, 0.0f, false, false, 2.038f, -4.5f)
                arcToRelative(2.283f, 2.283f, 0.0f, false, true, 0.959f, -1.554f)
                arcToRelative(4.933f, 4.933f, 0.0f, false, false, 0.508f, -0.445f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.232f, -7.7f)
                lineToRelative(2.975f, -2.975f)
                arcToRelative(6.035f, 6.035f, 0.0f, false, false, 2.62f, -1.534f)
                lineToRelative(0.214f, -0.214f)
                arcTo(1.767f, 1.767f, 0.0f, false, false, 23.482f, 0.518f)
                close()
                moveTo(16.027f, 14.027f)
                arcToRelative(2.888f, 2.888f, 0.0f, false, true, -0.3f, 0.265f)
                arcToRelative(4.192f, 4.192f, 0.0f, false, false, -1.745f, 2.99f)
                arcToRelative(5.072f, 5.072f, 0.0f, false, true, -1.458f, 3.239f)
                curveToRelative(-2.175f, 2.175f, -5.975f, 1.92f, -8.468f, -0.574f)
                reflectiveCurveTo(1.3f, 13.655f, 3.479f, 11.479f)
                arcToRelative(5.072f, 5.072f, 0.0f, false, true, 3.239f, -1.458f)
                arcToRelative(4.192f, 4.192f, 0.0f, false, false, 2.99f, -1.745f)
                arcToRelative(2.888f, 2.888f, 0.0f, false, true, 0.265f, -0.3f)
                arcTo(3.41f, 3.41f, 0.0f, false, true, 12.419f, 7.0f)
                arcToRelative(4.435f, 4.435f, 0.0f, false, true, 2.415f, 0.752f)
                lineTo(13.293f, 9.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(1.538f, -1.538f)
                arcTo(3.858f, 3.858f, 0.0f, false, true, 16.027f, 14.027f)
                close()
            }
        }
        .build()
        return _guitar!!
    }

private var _guitar: ImageVector? = null
