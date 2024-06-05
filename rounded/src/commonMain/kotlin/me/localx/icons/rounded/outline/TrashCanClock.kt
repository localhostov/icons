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

public val Icons.Outline.TrashCanClock: ImageVector
    get() {
        if (_trashCanClock != null) {
            return _trashCanClock!!
        }
        _trashCanClock = Builder(name = "TrashCanClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.101f)
                curveToRelative(-0.465f, -2.279f, -2.485f, -4.0f, -4.899f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.414f, 0.0f, -4.435f, 1.721f, -4.899f, 4.0f)
                lineTo(1.0f, 4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.304f, 0.0f, 2.415f, 0.836f, 2.828f, 2.0f)
                horizontalLineToRelative(-7.656f)
                curveToRelative(0.413f, -1.164f, 1.524f, -2.0f, 2.828f, -2.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(18.707f, 17.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.0f, -1.0f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.441f, -0.293f, -0.707f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.586f)
                lineToRelative(0.707f, 0.707f)
                close()
            }
        }
        .build()
        return _trashCanClock!!
    }

private var _trashCanClock: ImageVector? = null
