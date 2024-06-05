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

public val Icons.Bold.FileImport: ImageVector
    get() {
        if (_fileImport != null) {
            return _fileImport!!
        }
        _fileImport = Builder(name = "FileImport", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 8.157f)
                verticalLineToRelative(10.343f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-2.511f, 0.0f, -4.701f, -1.697f, -5.326f, -4.126f)
                curveToRelative(-0.207f, -0.802f, 0.275f, -1.62f, 1.078f, -1.827f)
                curveToRelative(0.797f, -0.208f, 1.62f, 0.276f, 1.826f, 1.079f)
                curveToRelative(0.284f, 1.104f, 1.28f, 1.874f, 2.422f, 1.874f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveTo(2.0f, 2.467f, 4.468f, 0.0f, 7.5f, 0.0f)
                horizontalLineToRelative(6.343f)
                curveToRelative(1.47f, 0.0f, 2.851f, 0.572f, 3.89f, 1.611f)
                lineToRelative(2.656f, 2.657f)
                curveToRelative(1.039f, 1.039f, 1.611f, 2.42f, 1.611f, 3.889f)
                close()
                moveTo(8.0f, 17.564f)
                curveToRelative(0.0f, 0.863f, 1.043f, 1.295f, 1.653f, 0.685f)
                lineToRelative(3.063f, -3.063f)
                curveToRelative(0.378f, -0.378f, 0.378f, -0.991f, 0.0f, -1.369f)
                lineToRelative(-3.063f, -3.063f)
                curveToRelative(-0.61f, -0.61f, -1.653f, -0.178f, -1.653f, 0.685f)
                verticalLineToRelative(1.563f)
                lineTo(1.5f, 13.002f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(1.563f)
                close()
            }
        }
        .build()
        return _fileImport!!
    }

private var _fileImport: ImageVector? = null
