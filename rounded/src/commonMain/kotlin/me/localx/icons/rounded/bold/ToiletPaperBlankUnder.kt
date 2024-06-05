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

public val Icons.Bold.ToiletPaperBlankUnder: ImageVector
    get() {
        if (_toiletPaperBlankUnder != null) {
            return _toiletPaperBlankUnder!!
        }
        _toiletPaperBlankUnder = Builder(name = "ToiletPaperBlankUnder", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.009f, 17.96f)
                curveToRelative(-0.021f, -0.043f, -0.009f, -9.96f, -0.009f, -9.96f)
                curveTo(22.0f, 3.633f, 20.251f, 0.084f, 18.077f, 0.002f)
                curveToRelative(-0.026f, -0.001f, -12.577f, -0.002f, -12.577f, -0.002f)
                curveTo(2.416f, 0.0f, 0.0f, 3.514f, 0.0f, 8.0f)
                curveToRelative(0.0f, 4.24f, 2.159f, 7.612f, 5.0f, 7.968f)
                verticalLineToRelative(2.532f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(10.347f)
                curveToRelative(1.738f, 0.0f, 3.153f, -1.415f, 3.153f, -3.154f)
                curveToRelative(0.0f, -1.294f, -0.807f, -2.453f, -1.991f, -2.886f)
                close()
                moveTo(18.0f, 4.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 1.567f, 1.0f, 3.5f)
                reflectiveCurveToRelative(-0.448f, 3.5f, -1.0f, 3.5f)
                reflectiveCurveToRelative(-1.0f, -1.567f, -1.0f, -3.5f)
                reflectiveCurveToRelative(0.448f, -3.5f, 1.0f, -3.5f)
                close()
                moveTo(3.0f, 8.0f)
                curveToRelative(0.0f, -2.862f, 1.32f, -5.0f, 2.5f, -5.0f)
                horizontalLineToRelative(9.378f)
                curveToRelative(-0.549f, 1.37f, -0.878f, 3.108f, -0.878f, 5.0f)
                reflectiveCurveToRelative(0.329f, 3.63f, 0.878f, 5.0f)
                lineTo(5.5f, 13.0f)
                curveToRelative(-1.18f, 0.0f, -2.5f, -2.138f, -2.5f, -5.0f)
                close()
                moveTo(20.847f, 21.0f)
                horizontalLineToRelative(-10.347f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                reflectiveCurveToRelative(10.052f, 0.0f, 10.077f, -0.002f)
                curveToRelative(0.318f, -0.012f, 0.627f, -0.098f, 0.923f, -0.25f)
                verticalLineToRelative(1.65f)
                curveToRelative(-0.142f, 1.199f, 0.36f, 2.695f, 1.831f, 3.282f)
                curveToRelative(0.084f, 0.034f, 0.169f, 0.102f, 0.169f, 0.167f)
                curveToRelative(0.0f, 0.085f, -0.068f, 0.154f, -0.153f, 0.154f)
                close()
            }
        }
        .build()
        return _toiletPaperBlankUnder!!
    }

private var _toiletPaperBlankUnder: ImageVector? = null
