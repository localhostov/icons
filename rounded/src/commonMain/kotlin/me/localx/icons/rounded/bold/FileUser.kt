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

public val Icons.Bold.FileUser: ImageVector
    get() {
        if (_fileUser != null) {
            return _fileUser!!
        }
        _fileUser = Builder(name = "FileUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 13.0f)
                curveToRelative(0.0f, 1.655f, -1.345f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.345f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.345f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.345f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 8.157f)
                verticalLineToRelative(10.343f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(2.0f, 5.5f)
                curveTo(2.0f, 2.467f, 4.467f, 0.0f, 7.5f, 0.0f)
                horizontalLineToRelative(6.343f)
                curveToRelative(1.47f, 0.0f, 2.851f, 0.572f, 3.89f, 1.611f)
                lineToRelative(2.656f, 2.657f)
                curveToRelative(1.039f, 1.039f, 1.611f, 2.42f, 1.611f, 3.889f)
                close()
                moveTo(19.0f, 18.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.245f, 0.914f, 2.279f, 2.107f, 2.469f)
                curveToRelative(0.475f, -2.267f, 2.485f, -3.969f, 4.893f, -3.969f)
                reflectiveCurveToRelative(4.418f, 1.702f, 4.893f, 3.969f)
                curveToRelative(1.193f, -0.189f, 2.107f, -1.224f, 2.107f, -2.469f)
                close()
            }
        }
        .build()
        return _fileUser!!
    }

private var _fileUser: ImageVector? = null
