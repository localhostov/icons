package me.localx.icons.rounded.bold

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

public val Icons.Bold.ContainerStorage: ImageVector
    get() {
        if (_containerStorage != null) {
            return _containerStorage!!
        }
        _containerStorage = Builder(name = "ContainerStorage", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 18.086f)
                lineTo(23.0f, 5.914f)
                curveToRelative(0.583f, -0.206f, 1.0f, -0.761f, 1.0f, -1.414f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                lineTo(1.5f, 3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.653f, 0.417f, 1.208f, 1.0f, 1.414f)
                verticalLineToRelative(12.171f)
                curveToRelative(-0.583f, 0.206f, -1.0f, 0.761f, -1.0f, 1.414f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(21.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.653f, -0.417f, -1.208f, -1.0f, -1.414f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(15.0f, 14.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(10.5f, 14.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(6.0f, 14.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _containerStorage!!
    }

private var _containerStorage: ImageVector? = null
