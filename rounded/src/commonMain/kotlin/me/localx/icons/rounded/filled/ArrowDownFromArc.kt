package me.localx.icons.rounded.filled

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

public val Icons.Filled.ArrowDownFromArc: ImageVector
    get() {
        if (_arrowDownFromArc != null) {
            return _arrowDownFromArc!!
        }
        _arrowDownFromArc = Builder(name = "ArrowDownFromArc", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(18.296f, 16.401f)
                lineToRelative(-5.179f, 5.136f)
                curveToRelative(-0.034f, 0.034f, -0.081f, 0.046f, -0.117f, 0.076f)
                verticalLineToRelative(-13.613f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(13.613f)
                curveToRelative(-0.037f, -0.031f, -0.085f, -0.043f, -0.119f, -0.078f)
                lineToRelative(-5.177f, -5.134f)
                curveToRelative(-0.392f, -0.388f, -1.024f, -0.387f, -1.414f, 0.006f)
                curveToRelative(-0.389f, 0.393f, -0.387f, 1.025f, 0.006f, 1.414f)
                lineToRelative(5.175f, 5.132f)
                curveToRelative(0.676f, 0.675f, 1.574f, 1.047f, 2.529f, 1.047f)
                reflectiveCurveToRelative(1.854f, -0.372f, 2.527f, -1.045f)
                lineToRelative(5.177f, -5.134f)
                curveToRelative(0.393f, -0.389f, 0.395f, -1.021f, 0.006f, -1.414f)
                curveToRelative(-0.39f, -0.394f, -1.021f, -0.395f, -1.414f, -0.006f)
                close()
            }
        }
        .build()
        return _arrowDownFromArc!!
    }

private var _arrowDownFromArc: ImageVector? = null
