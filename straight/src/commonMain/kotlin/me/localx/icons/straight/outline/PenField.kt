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

public val Icons.Outline.PenField: ImageVector
    get() {
        if (_penField != null) {
            return _penField!!
        }
        _penField = Builder(name = "PenField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.0f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 23.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 10.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -0.53f, -0.418f, -0.956f, -0.941f, -0.988f)
                lineToRelative(1.541f, -1.541f)
                curveToRelative(0.839f, 0.532f, 1.401f, 1.464f, 1.401f, 2.529f)
                close()
                moveTo(5.0f, 15.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(11.5f, 17.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(16.242f, 12.0f)
                horizontalLineToRelative(-4.242f)
                verticalLineToRelative(-4.243f)
                lineTo(18.879f, 0.879f)
                curveToRelative(1.17f, -1.17f, 3.072f, -1.17f, 4.242f, 0.0f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.32f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.879f, 2.122f)
                lineToRelative(-6.879f, 6.878f)
                close()
                moveTo(15.414f, 10.0f)
                lineToRelative(6.293f, -6.293f)
                curveToRelative(0.189f, -0.189f, 0.293f, -0.44f, 0.293f, -0.707f)
                reflectiveCurveToRelative(-0.104f, -0.518f, -0.293f, -0.707f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.39f, -1.414f, 0.0f)
                lineToRelative(-6.293f, 6.292f)
                verticalLineToRelative(1.415f)
                horizontalLineToRelative(1.414f)
                close()
            }
        }
        .build()
        return _penField!!
    }

private var _penField: ImageVector? = null
