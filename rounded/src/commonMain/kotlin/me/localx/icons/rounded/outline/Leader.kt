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

public val Icons.Outline.Leader: ImageVector
    get() {
        if (_leader != null) {
            return _leader!!
        }
        _leader = Builder(name = "Leader", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(22.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4.134f)
                curveToRelative(-0.472f, 0.0f, -0.931f, -0.168f, -1.291f, -0.473f)
                lineTo(2.354f, 2.686f)
                curveToRelative(-0.422f, -0.356f, -0.475f, -0.987f, -0.118f, -1.409f)
                curveToRelative(0.357f, -0.421f, 0.988f, -0.476f, 1.409f, -0.117f)
                lineToRelative(5.721f, 4.84f)
                horizontalLineToRelative(4.134f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.391f, -0.822f, 2.585f, -2.0f, 3.149f)
                verticalLineToRelative(4.351f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(11.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _leader!!
    }

private var _leader: ImageVector? = null
