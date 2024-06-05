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

public val Icons.Outline.Poo: ImageVector
    get() {
        if (_poo != null) {
            return _poo!!
        }
        _poo = Builder(name = "Poo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                arcToRelative(9.454f, 9.454f, 0.0f, false, true, -5.666f, -2.254f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.332f, -1.492f)
                arcToRelative(6.359f, 6.359f, 0.0f, false, false, 8.67f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.33f, 1.493f)
                arcTo(9.454f, 9.454f, 0.0f, false, true, 12.0f, 19.0f)
                close()
                moveTo(9.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 11.0f)
                close()
                moveTo(14.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 11.0f)
                close()
                moveTo(24.0f, 18.5f)
                arcToRelative(5.483f, 5.483f, 0.0f, false, false, -2.139f, -4.329f)
                arcToRelative(4.982f, 4.982f, 0.0f, false, false, -1.9f, -5.178f)
                arcTo(3.514f, 3.514f, 0.0f, false, false, 16.89f, 5.021f)
                curveTo(16.408f, 2.747f, 14.4f, 0.0f, 12.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 8.806f, 5.0f)
                lineTo(7.5f, 5.0f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 4.035f, 8.993f)
                arcToRelative(4.981f, 4.981f, 0.0f, false, false, -1.9f, 5.178f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 18.5f)
                close()
                moveTo(9.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.316f, -0.052f)
                arcTo(5.773f, 5.773f, 0.0f, false, false, 12.9f, 2.309f)
                arcTo(5.237f, 5.237f, 0.0f, false, true, 15.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.505f, 1.505f, 0.0f, false, true, 1.385f, 2.071f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.469f, 1.272f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, true, 1.4f, 3.842f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.433f, 1.271f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.5f, 22.0f)
                lineTo(5.5f, 22.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.687f, -6.544f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.433f, -1.271f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, true, 1.4f, -3.842f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.469f, -1.272f)
                arcTo(1.505f, 1.505f, 0.0f, false, true, 7.5f, 7.0f)
                close()
                moveTo(17.0f, 6.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _poo!!
    }

private var _poo: ImageVector? = null
