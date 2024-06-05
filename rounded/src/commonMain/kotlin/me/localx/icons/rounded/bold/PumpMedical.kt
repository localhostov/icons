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

public val Icons.Bold.PumpMedical: ImageVector
    get() {
        if (_pumpMedical != null) {
            return _pumpMedical!!
        }
        _pumpMedical = Builder(name = "PumpMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.437f, 2.328f)
                lineToRelative(-0.582f, -0.465f)
                curveToRelative(-1.502f, -1.202f, -3.388f, -1.863f, -5.31f, -1.863f)
                horizontalLineToRelative(-4.545f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.445f)
                curveToRelative(-3.135f, 1.306f, -6.0f, 4.197f, -6.0f, 8.244f)
                verticalLineToRelative(4.811f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-4.811f)
                curveToRelative(0.0f, -4.047f, -2.865f, -6.938f, -6.0f, -8.244f)
                verticalLineToRelative(-2.445f)
                horizontalLineToRelative(2.545f)
                curveToRelative(1.243f, 0.0f, 2.464f, 0.428f, 3.436f, 1.206f)
                lineToRelative(0.583f, 0.466f)
                curveToRelative(0.646f, 0.517f, 1.592f, 0.41f, 2.108f, -0.235f)
                curveToRelative(0.518f, -0.647f, 0.412f, -1.591f, -0.235f, -2.108f)
                close()
                moveTo(18.0f, 13.689f)
                verticalLineToRelative(4.811f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-4.811f)
                curveToRelative(0.0f, -3.071f, 2.502f, -4.962f, 4.728f, -5.689f)
                horizontalLineToRelative(2.544f)
                curveToRelative(2.226f, 0.727f, 4.728f, 2.619f, 4.728f, 5.689f)
                close()
                moveTo(13.5f, 13.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _pumpMedical!!
    }

private var _pumpMedical: ImageVector? = null
