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

public val Icons.Outline.Sport: ImageVector
    get() {
        if (_sport != null) {
            return _sport!!
        }
        _sport = Builder(name = "Sport", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.014f, 24.0f)
                horizontalLineTo(6.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, -6.0f, -6.0f)
                verticalLineTo(15.162f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 7.236f, 9.291f)
                lineTo(20.01f, 11.98f)
                lineTo(21.881f, 0.835f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.973f, 0.331f)
                lineTo(21.4f, 15.8f)
                arcToRelative(9.335f, 9.335f, 0.0f, false, true, -0.667f, 2.511f)
                arcTo(9.518f, 9.518f, 0.0f, false, true, 12.014f, 24.0f)
                close()
                moveTo(5.994f, 11.161f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.994f, 4.0f)
                verticalLineTo(18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(6.014f)
                arcTo(7.518f, 7.518f, 0.0f, false, false, 18.9f, 17.508f)
                arcToRelative(7.515f, 7.515f, 0.0f, false, false, 0.521f, -2.01f)
                lineToRelative(0.259f, -1.544f)
                lineTo(6.824f, 11.248f)
                arcTo(4.035f, 4.035f, 0.0f, false, false, 5.994f, 11.161f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.517f, 17.058f)
                arcToRelative(1.029f, 1.029f, 0.0f, false, true, -0.206f, -0.021f)
                lineTo(5.8f, 15.252f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 6.21f, 13.3f)
                lineToRelative(8.511f, 1.785f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.2f, 1.978f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 20.279f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, true, -0.208f, -0.022f)
                lineTo(4.83f, 19.207f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.414f, -1.957f)
                lineToRelative(4.963f, 1.05f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 20.279f)
                close()
            }
        }
        .build()
        return _sport!!
    }

private var _sport: ImageVector? = null
