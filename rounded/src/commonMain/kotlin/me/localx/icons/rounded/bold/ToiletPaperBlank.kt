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

public val Icons.Bold.ToiletPaperBlank: ImageVector
    get() {
        if (_toiletPaperBlank != null) {
            return _toiletPaperBlank!!
        }
        _toiletPaperBlank = Builder(name = "ToiletPaperBlank", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 0.0f)
                lineTo(7.5f, 0.0f)
                curveTo(4.416f, 0.0f, 2.0f, 3.514f, 2.0f, 8.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.462f, -0.441f, 0.628f, -0.656f, 0.781f)
                curveToRelative(-0.835f, 0.594f, -1.344f, 1.537f, -1.344f, 2.565f)
                curveToRelative(0.0f, 1.738f, 1.415f, 3.153f, 3.153f, 3.153f)
                lineTo(13.5f, 23.999f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -3.582f, 4.0f, -8.0f)
                reflectiveCurveTo(22.209f, 0.0f, 20.0f, 0.0f)
                close()
                moveTo(16.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(3.153f, 21.0f)
                curveToRelative(-0.085f, 0.0f, -0.153f, -0.068f, -0.153f, -0.153f)
                curveToRelative(0.0f, -0.068f, 0.087f, -0.134f, 0.169f, -0.167f)
                curveToRelative(1.471f, -0.588f, 1.973f, -2.083f, 1.831f, -3.281f)
                lineTo(5.0f, 8.0f)
                curveToRelative(0.0f, -2.861f, 1.32f, -5.0f, 2.5f, -5.0f)
                horizontalLineToRelative(9.378f)
                curveToRelative(-0.549f, 1.37f, -0.878f, 3.108f, -0.878f, 5.0f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(20.0f, 11.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -1.567f, -1.0f, -3.5f)
                reflectiveCurveToRelative(0.448f, -3.5f, 1.0f, -3.5f)
                reflectiveCurveToRelative(1.0f, 1.567f, 1.0f, 3.5f)
                reflectiveCurveToRelative(-0.448f, 3.5f, -1.0f, 3.5f)
                close()
            }
        }
        .build()
        return _toiletPaperBlank!!
    }

private var _toiletPaperBlank: ImageVector? = null
