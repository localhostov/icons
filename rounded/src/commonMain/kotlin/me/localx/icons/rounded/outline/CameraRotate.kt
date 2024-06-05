package me.localx.icons.rounded.outline

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

public val Icons.Outline.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(name = "CameraRotate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 4.0f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-2.1f, -2.801f)
                curveToRelative(-0.564f, -0.751f, -1.461f, -1.199f, -2.399f, -1.199f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.938f, 0.0f, -1.835f, 0.448f, -2.4f, 1.2f)
                lineToRelative(-2.1f, 2.8f)
                horizontalLineToRelative(-0.5f)
                curveTo(2.243f, 4.0f, 0.0f, 6.243f, 0.0f, 9.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(9.199f, 2.4f)
                curveToRelative(0.188f, -0.251f, 0.488f, -0.4f, 0.801f, -0.4f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.313f, 0.0f, 0.612f, 0.149f, 0.8f, 0.399f)
                lineToRelative(1.2f, 1.601f)
                lineTo(8.0f, 4.0f)
                lineToRelative(1.2f, -1.6f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(18.0f, 9.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.643f)
                curveToRelative(-0.721f, -0.634f, -1.659f, -1.0f, -2.643f, -1.0f)
                curveToRelative(-1.591f, 0.0f, -3.03f, 0.942f, -3.667f, 2.4f)
                curveToRelative(-0.165f, 0.376f, -0.532f, 0.6f, -0.917f, 0.6f)
                curveToRelative(-0.134f, 0.0f, -0.27f, -0.026f, -0.4f, -0.084f)
                curveToRelative(-0.506f, -0.221f, -0.737f, -0.811f, -0.516f, -1.316f)
                curveToRelative(0.956f, -2.187f, 3.115f, -3.6f, 5.5f, -3.6f)
                curveToRelative(1.492f, 0.0f, 2.913f, 0.562f, 4.0f, 1.532f)
                verticalLineToRelative(-0.532f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(17.5f, 16.4f)
                curveToRelative(-0.956f, 2.187f, -3.115f, 3.6f, -5.5f, 3.6f)
                curveToRelative(-1.474f, 0.0f, -2.88f, -0.548f, -3.961f, -1.496f)
                verticalLineToRelative(0.496f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.961f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.643f)
                curveToRelative(0.721f, 0.634f, 1.659f, 1.0f, 2.643f, 1.0f)
                curveToRelative(1.591f, 0.0f, 3.03f, -0.942f, 3.667f, -2.4f)
                curveToRelative(0.222f, -0.507f, 0.811f, -0.738f, 1.317f, -0.516f)
                curveToRelative(0.506f, 0.221f, 0.737f, 0.811f, 0.516f, 1.316f)
                close()
            }
        }
        .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
