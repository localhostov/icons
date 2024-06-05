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

public val Icons.Outline.TrashCanSlash: ImageVector
    get() {
        if (_trashCanSlash != null) {
            return _trashCanSlash!!
        }
        _trashCanSlash = Builder(name = "TrashCanSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-3.803f, -3.803f)
                lineTo(19.904f, 6.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.101f)
                curveToRelative(-0.465f, -2.279f, -2.485f, -4.0f, -4.899f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.414f, 0.0f, -4.435f, 1.721f, -4.899f, 4.0f)
                horizontalLineToRelative(-0.504f)
                curveToRelative(-0.028f, 0.0f, -0.055f, 0.001f, -0.082f, 0.004f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(17.904f, 16.49f)
                lineTo(7.414f, 6.0f)
                horizontalLineToRelative(10.49f)
                verticalLineToRelative(10.49f)
                close()
                moveTo(10.904f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.304f, 0.0f, 2.415f, 0.836f, 2.828f, 2.0f)
                horizontalLineToRelative(-7.656f)
                curveToRelative(0.413f, -1.164f, 1.524f, -2.0f, 2.828f, -2.0f)
                close()
                moveTo(17.851f, 21.882f)
                curveToRelative(0.29f, 0.471f, 0.144f, 1.087f, -0.326f, 1.376f)
                curveToRelative(-0.786f, 0.485f, -1.693f, 0.742f, -2.621f, 0.742f)
                horizontalLineToRelative(-5.904f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.904f)
                curveToRelative(0.557f, 0.0f, 1.101f, -0.153f, 1.571f, -0.443f)
                curveToRelative(0.469f, -0.292f, 1.086f, -0.144f, 1.376f, 0.325f)
                close()
            }
        }
        .build()
        return _trashCanSlash!!
    }

private var _trashCanSlash: ImageVector? = null
