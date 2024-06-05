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

public val Icons.Outline.Stroopwafel: ImageVector
    get() {
        if (_stroopwafel != null) {
            return _stroopwafel!!
        }
        _stroopwafel = Builder(name = "Stroopwafel", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(19.715f, 9.712f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-2.586f, -2.586f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(-2.586f, 2.586f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(2.586f, 2.586f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(2.586f, -2.586f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(2.293f, -2.293f)
                close()
                moveTo(12.008f, 14.591f)
                lineToRelative(-2.586f, -2.586f)
                lineToRelative(2.586f, -2.586f)
                lineToRelative(2.586f, 2.586f)
                lineToRelative(-2.586f, 2.586f)
                close()
            }
        }
        .build()
        return _stroopwafel!!
    }

private var _stroopwafel: ImageVector? = null
