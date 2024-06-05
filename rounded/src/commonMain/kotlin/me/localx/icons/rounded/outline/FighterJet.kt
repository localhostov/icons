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

public val Icons.Outline.FighterJet: ImageVector
    get() {
        if (_fighterJet != null) {
            return _fighterJet!!
        }
        _fighterJet = Builder(name = "FighterJet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.583f, 8.558f)
                lineTo(11.581f, 2.0f)
                lineTo(13.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                reflectiveCurveTo(9.643f, 0.005f, 9.53f, 0.037f)
                arcTo(3.005f, 3.005f, 0.0f, false, false, 7.0f, 3.0f)
                lineTo(7.0f, 9.0f)
                lineTo(5.537f, 9.0f)
                lineTo(4.44f, 7.343f)
                curveTo(3.39f, 5.547f, 0.075f, 5.445f, 0.0f, 7.938f)
                verticalLineToRelative(8.124f)
                curveToRelative(0.073f, 2.495f, 3.415f, 2.394f, 4.459f, 0.584f)
                lineTo(5.54f, 15.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, false, 2.528f, 2.963f)
                curveTo(9.617f, 23.988f, 13.0f, 24.0f, 13.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(11.584f, 22.0f)
                lineToRelative(4.0f, -6.531f)
                curveTo(26.843f, 14.9f, 26.845f, 9.091f, 15.583f, 8.558f)
                close()
                moveTo(14.937f, 13.508f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.79f, 0.476f)
                lineToRelative(-4.773f, 7.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 21.0f)
                lineTo(9.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(5.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.836f, 0.451f)
                lineToRelative(-1.376f, 2.1f)
                arcTo(1.267f, 1.267f, 0.0f, false, true, 2.0f, 16.062f)
                lineTo(1.938f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.834f, 0.448f)
                lineToRelative(1.4f, 2.1f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(9.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.373f, -0.778f)
                lineToRelative(4.773f, 7.82f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.794f, 0.478f)
                curveToRelative(3.138f, 0.188f, 6.327f, 0.873f, 6.994f, 1.481f)
                curveTo(21.27f, 12.611f, 18.079f, 13.309f, 14.937f, 13.508f)
                close()
            }
        }
        .build()
        return _fighterJet!!
    }

private var _fighterJet: ImageVector? = null
