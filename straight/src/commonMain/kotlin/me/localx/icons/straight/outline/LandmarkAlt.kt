package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.LandmarkAlt: ImageVector
    get() {
        if (_landmarkAlt != null) {
            return _landmarkAlt!!
        }
        _landmarkAlt = Builder(name = "LandmarkAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 22.0f)
                close()
                moveTo(23.0f, 20.0f)
                lineTo(1.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                lineTo(1.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.056f, 10.0f)
                curveToRelative(0.463f, -4.165f, 3.779f, -7.482f, 7.944f, -7.944f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 2.056f)
                curveToRelative(4.165f, 0.463f, 7.482f, 3.779f, 7.944f, 7.944f)
                horizontalLineToRelative(2.056f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(10.0f, 12.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(5.072f, 10.0f)
                horizontalLineToRelative(13.857f)
                curveToRelative(-0.487f, -3.388f, -3.408f, -6.0f, -6.928f, -6.0f)
                reflectiveCurveToRelative(-6.441f, 2.612f, -6.928f, 6.0f)
                close()
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _landmarkAlt!!
    }

private var _landmarkAlt: ImageVector? = null
