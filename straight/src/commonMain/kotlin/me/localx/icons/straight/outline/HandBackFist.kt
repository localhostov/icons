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

public val Icons.Outline.HandBackFist: ImageVector
    get() {
        if (_handBackFist != null) {
            return _handBackFist!!
        }
        _handBackFist = Builder(name = "HandBackFist", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.196f, 0.02f)
                lineToRelative(-0.196f, -0.02f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.581f)
                lineTo(0.879f, 8.636f)
                curveToRelative(-0.566f, 0.567f, -0.879f, 1.32f, -0.879f, 2.122f)
                reflectiveCurveToRelative(0.312f, 1.555f, 0.854f, 2.095f)
                lineToRelative(5.146f, 5.541f)
                verticalLineToRelative(5.607f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-6.808f)
                lineToRelative(1.642f, -4.105f)
                curveToRelative(0.238f, -0.593f, 0.358f, -1.218f, 0.358f, -1.858f)
                lineTo(23.0f, 2.98f)
                lineTo(8.196f, 0.02f)
                close()
                moveTo(21.0f, 11.23f)
                curveToRelative(0.0f, 0.384f, -0.072f, 0.759f, -0.215f, 1.114f)
                lineToRelative(-1.785f, 4.464f)
                verticalLineToRelative(5.192f)
                lineTo(8.0f, 22.0f)
                verticalLineToRelative(-4.393f)
                lineTo(2.293f, 11.464f)
                curveToRelative(-0.189f, -0.188f, -0.293f, -0.439f, -0.293f, -0.707f)
                reflectiveCurveToRelative(0.104f, -0.518f, 0.287f, -0.701f)
                lineToRelative(2.713f, -2.669f)
                verticalLineToRelative(3.613f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 3.0f)
                curveToRelative(0.0f, -0.524f, 0.404f, -0.955f, 0.918f, -0.997f)
                lineToRelative(13.082f, 2.616f)
                verticalLineToRelative(6.61f)
                close()
            }
        }
        .build()
        return _handBackFist!!
    }

private var _handBackFist: ImageVector? = null
