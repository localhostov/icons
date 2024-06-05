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

public val Icons.Outline.ImagesUser: ImageVector
    get() {
        if (_imagesUser != null) {
            return _imagesUser!!
        }
        _imagesUser = Builder(name = "ImagesUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 2.0f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.05f, 16.0f)
                curveToRelative(0.232f, -1.14f, 1.242f, -2.0f, 2.45f, -2.0f)
                reflectiveCurveToRelative(2.217f, 0.86f, 2.45f, 2.0f)
                horizontalLineToRelative(-4.899f)
                close()
                moveTo(22.0f, 13.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-0.028f)
                curveToRelative(-0.25f, -2.247f, -2.16f, -4.0f, -4.472f, -4.0f)
                reflectiveCurveToRelative(-4.223f, 1.753f, -4.472f, 4.0f)
                horizontalLineToRelative(-0.028f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(18.0f, 21.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.234f, 0.453f, -2.419f, 1.276f, -3.338f)
                curveToRelative(0.368f, -0.41f, 1.001f, -0.447f, 1.412f, -0.076f)
                curveToRelative(0.411f, 0.368f, 0.446f, 1.0f, 0.077f, 1.412f)
                curveToRelative(-0.494f, 0.55f, -0.766f, 1.262f, -0.766f, 2.002f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(17.0f, 8.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _imagesUser!!
    }

private var _imagesUser: ImageVector? = null
