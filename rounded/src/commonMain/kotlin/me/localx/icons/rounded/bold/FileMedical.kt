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

public val Icons.Bold.FileMedical: ImageVector
    get() {
        if (_fileMedical != null) {
            return _fileMedical!!
        }
        _fileMedical = Builder(name = "FileMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 15.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(22.0f, 8.157f)
                verticalLineToRelative(10.343f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(2.0f, 5.5f)
                curveTo(2.0f, 2.467f, 4.467f, 0.0f, 7.5f, 0.0f)
                horizontalLineToRelative(6.343f)
                curveToRelative(1.469f, 0.0f, 2.85f, 0.572f, 3.889f, 1.611f)
                lineToRelative(2.657f, 2.657f)
                curveToRelative(1.039f, 1.039f, 1.611f, 2.419f, 1.611f, 3.889f)
                close()
                moveTo(19.0f, 18.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _fileMedical!!
    }

private var _fileMedical: ImageVector? = null
