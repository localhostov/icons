package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.CallDuration: ImageVector
    get() {
        if (_callDuration != null) {
            return _callDuration!!
        }
        _callDuration = Builder(name = "CallDuration", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.295f, 14.923f)
                curveToRelative(-2.328f, -1.098f, -4.042f, -2.819f, -5.207f, -5.228f)
                lineToRelative(2.614f, -2.614f)
                lineTo(5.061f, 0.44f)
                lineTo(1.766f, 3.734f)
                curveToRelative(-1.139f, 1.137f, -1.766f, 2.672f, -1.766f, 4.324f)
                curveToRelative(0.0f, 7.151f, 8.791f, 15.942f, 15.942f, 15.942f)
                curveToRelative(1.651f, 0.0f, 3.187f, -0.627f, 4.322f, -1.765f)
                lineToRelative(3.295f, -3.296f)
                lineToRelative(-6.641f, -6.642f)
                lineToRelative(-2.624f, 2.625f)
                close()
                moveTo(18.143f, 20.115f)
                curveToRelative(-0.57f, 0.57f, -1.351f, 0.885f, -2.2f, 0.885f)
                curveToRelative(-4.993f, 0.0f, -12.942f, -7.066f, -12.942f, -12.942f)
                curveToRelative(0.0f, -0.849f, 0.314f, -1.63f, 0.886f, -2.201f)
                lineToRelative(1.175f, -1.174f)
                lineToRelative(2.399f, 2.399f)
                lineToRelative(-1.919f, 1.918f)
                lineToRelative(0.369f, 0.919f)
                curveToRelative(1.59f, 3.96f, 4.348f, 6.712f, 8.196f, 8.181f)
                lineToRelative(0.908f, 0.347f)
                lineToRelative(1.905f, -1.905f)
                lineToRelative(2.399f, 2.398f)
                lineToRelative(-1.175f, 1.176f)
                close()
                moveTo(18.5f, 11.0f)
                curveToRelative(3.038f, 0.0f, 5.5f, -2.462f, 5.5f, -5.5f)
                reflectiveCurveTo(21.538f, 0.0f, 18.5f, 0.0f)
                reflectiveCurveToRelative(-5.5f, 2.462f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(17.5f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.086f)
                lineToRelative(2.207f, 2.207f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.793f, -2.793f)
                verticalLineToRelative(-3.914f)
                close()
            }
        }
        .build()
        return _callDuration!!
    }

private var _callDuration: ImageVector? = null
