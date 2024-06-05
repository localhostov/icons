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

public val Icons.Bold.HouseChimney: ImageVector
    get() {
        if (_houseChimney != null) {
            return _houseChimney!!
        }
        _houseChimney = Builder(name = "HouseChimney", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.644f)
                lineTo(22.0f, 2.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.089f)
                lineTo(15.076f, 0.941f)
                curveToRelative(-1.869f, -1.262f, -4.283f, -1.262f, -6.152f, 0.0f)
                lineTo(2.424f, 5.327f)
                curveTo(0.906f, 6.351f, 0.0f, 8.055f, 0.0f, 9.886f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(10.0f, 14.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 9.886f)
                curveToRelative(0.0f, -1.654f, -0.739f, -3.204f, -2.0f, -4.242f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 9.886f)
                curveToRelative(0.0f, -0.833f, 0.412f, -1.607f, 1.102f, -2.073f)
                lineTo(10.602f, 3.427f)
                curveToRelative(0.85f, -0.573f, 1.947f, -0.573f, 2.797f, 0.0f)
                lineToRelative(6.5f, 4.387f)
                curveToRelative(0.689f, 0.465f, 1.102f, 1.24f, 1.102f, 2.072f)
                verticalLineToRelative(8.614f)
                close()
            }
        }
        .build()
        return _houseChimney!!
    }

private var _houseChimney: ImageVector? = null
