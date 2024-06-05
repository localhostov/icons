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

public val Icons.Outline.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.914f, 10.5f)
                lineTo(13.5f, 0.086f)
                lineToRelative(-3.5f, 3.5f)
                verticalLineToRelative(4.92f)
                lineTo(0.879f, 17.627f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.072f, 0.0f, 4.242f)
                lineToRelative(1.251f, 1.252f)
                curveToRelative(0.567f, 0.566f, 1.32f, 0.879f, 2.122f, 0.879f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                lineToRelative(9.121f, -9.121f)
                horizontalLineToRelative(4.92f)
                lineToRelative(3.5f, -3.5f)
                close()
                moveTo(4.958f, 21.707f)
                curveToRelative(-0.377f, 0.379f, -1.036f, 0.379f, -1.414f, 0.0f)
                lineToRelative(-1.252f, -1.252f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(8.667f, -8.667f)
                lineToRelative(2.666f, 2.666f)
                lineToRelative(-8.667f, 8.667f)
                close()
                moveTo(15.414f, 12.0f)
                lineToRelative(-3.414f, -3.414f)
                verticalLineToRelative(-4.172f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(7.586f, 7.586f)
                lineToRelative(-1.5f, 1.5f)
                horizontalLineToRelative(-4.172f)
                close()
                moveTo(11.707f, 13.707f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
