package me.localx.icons.straight.outline

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

public val Icons.Outline.WaterLadder: ImageVector
    get() {
        if (_waterLadder != null) {
            return _waterLadder!!
        }
        _waterLadder = Builder(name = "WaterLadder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(17.0f, 8.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(24.01f, 22.631f)
                curveToRelative(-0.76f, 0.87f, -1.856f, 1.369f, -3.01f, 1.369f)
                curveToRelative(-1.194f, 0.0f, -2.267f, -0.525f, -3.0f, -1.357f)
                curveToRelative(-0.733f, 0.832f, -1.806f, 1.357f, -3.0f, 1.357f)
                reflectiveCurveToRelative(-2.267f, -0.525f, -3.0f, -1.357f)
                curveToRelative(-0.733f, 0.832f, -1.806f, 1.357f, -3.0f, 1.357f)
                reflectiveCurveToRelative(-2.267f, -0.525f, -3.0f, -1.357f)
                curveToRelative(-0.733f, 0.832f, -1.806f, 1.357f, -3.0f, 1.357f)
                curveToRelative(-1.153f, 0.0f, -2.25f, -0.499f, -3.01f, -1.369f)
                lineToRelative(1.508f, -1.314f)
                curveToRelative(0.379f, 0.435f, 0.927f, 0.684f, 1.502f, 0.684f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.575f, 0.0f, 1.123f, -0.249f, 1.502f, -0.684f)
                lineToRelative(1.508f, 1.314f)
                close()
            }
        }
        .build()
        return _waterLadder!!
    }

private var _waterLadder: ImageVector? = null
