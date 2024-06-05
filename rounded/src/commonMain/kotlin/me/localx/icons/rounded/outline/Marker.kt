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

public val Icons.Outline.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcToRelative(5.271f, 5.271f, 0.0f, false, true, -4.311f, -2.2f)
                curveToRelative(-3.811f, -5.257f, -5.744f, -9.209f, -5.744f, -11.747f)
                arcToRelative(10.055f, 10.055f, 0.0f, false, true, 20.11f, 0.0f)
                curveToRelative(0.0f, 2.538f, -1.933f, 6.49f, -5.744f, 11.747f)
                arcTo(5.271f, 5.271f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 2.181f)
                arcToRelative(7.883f, 7.883f, 0.0f, false, false, -7.874f, 7.874f)
                curveToRelative(0.0f, 2.01f, 1.893f, 5.727f, 5.329f, 10.466f)
                arcToRelative(3.145f, 3.145f, 0.0f, false, false, 5.09f, 0.0f)
                curveToRelative(3.436f, -4.739f, 5.329f, -8.456f, 5.329f, -10.466f)
                arcTo(7.883f, 7.883f, 0.0f, false, false, 12.0f, 2.181f)
                close()
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
