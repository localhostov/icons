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

public val Icons.Bold.FolderFire: ImageVector
    get() {
        if (_folderFire != null) {
            return _folderFire!!
        }
        _folderFire = Builder(name = "FolderFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.171f, -0.018f, -0.338f, -0.051f, -0.5f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.468f, 2.467f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(2.528f)
                curveToRelative(0.54f, 0.0f, 1.081f, 0.128f, 1.564f, 0.369f)
                lineToRelative(3.156f, 1.578f)
                curveToRelative(0.068f, 0.034f, 0.146f, 0.053f, 0.224f, 0.053f)
                horizontalLineToRelative(5.528f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(24.0f, 17.974f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 3.208f, -2.507f, 5.831f, -5.669f, 6.016f)
                curveToRelative(-2.642f, 0.155f, -4.939f, -1.57f, -5.956f, -4.014f)
                curveToRelative(-0.95f, -2.283f, 0.052f, -4.425f, 1.125f, -5.752f)
                curveToRelative(0.28f, -0.346f, 0.827f, -0.283f, 1.007f, 0.123f)
                curveToRelative(0.254f, 0.575f, 0.17f, 1.505f, 0.708f, 1.505f)
                curveToRelative(1.137f, 0.0f, 0.876f, -3.27f, 2.145f, -5.416f)
                curveToRelative(0.225f, -0.381f, 0.748f, -0.455f, 1.078f, -0.161f)
                curveToRelative(2.05f, 1.829f, 5.562f, 4.532f, 5.562f, 7.699f)
                close()
                moveTo(19.345f, 18.453f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.894f, -0.894f)
                curveToRelative(-0.249f, -0.249f, -0.652f, -0.249f, -0.901f, 0.0f)
                lineToRelative(-0.894f, 0.894f)
                curveToRelative(-0.763f, 0.763f, -0.899f, 2.015f, -0.197f, 2.835f)
                curveToRelative(0.813f, 0.948f, 2.271f, 0.948f, 3.083f, 0.0f)
                curveToRelative(0.703f, -0.819f, 0.566f, -2.072f, -0.197f, -2.835f)
                close()
            }
        }
        .build()
        return _folderFire!!
    }

private var _folderFire: ImageVector? = null
